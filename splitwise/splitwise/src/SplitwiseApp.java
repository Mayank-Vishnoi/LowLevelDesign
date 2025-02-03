import java.util.Arrays;
import java.util.List;

import models.Expense;
import models.Group;
import models.Split;
import models.User;
import services.ExpenseService;
import services.GroupService;
import services.UserService;

public class SplitwiseApp {
    public static void main(String[] args) {
        UserService userService = new UserService();
        GroupService groupService = new GroupService();
        ExpenseService expenseService = new ExpenseService();

        // Create Users
        User alice = userService.createUser("Alice", "1234567890");
        User bob = userService.createUser("Bob", "0987654321");
        User charlie = userService.createUser("Charlie", "1112223333");

        // Add Friendships
        userService.addFriend(alice.getId(), bob.getId());
        userService.addFriend(alice.getId(), charlie.getId());
        userService.addFriend(bob.getId(), charlie.getId());

        // Create Group: "Goa Trip"
        Group tripGroup = groupService.addGroup(alice.getId(), "Goa Trip");
        groupService.addMemberToGroup(tripGroup.getId(), bob.getId());
        groupService.addMemberToGroup(tripGroup.getId(), charlie.getId());

        // Display relationships (need some dependency injections in order for this to work)
        userService.displayProfile(alice.getId());
        userService.displayProfile(bob.getId());
        groupService.showMembers(tripGroup.getId());

        // Expense 1: Alice pays ₹1200 for lunch (EQUAL split)
        List<Split> lunchSplits = Arrays.asList(
            new Split(alice.getId(), 400L), 
            new Split(bob.getId(), 400L), 
            new Split(charlie.getId(), 400L)
        );
        expenseService.addExpense(alice.getId(), 1200, "Lunch", Expense.SplitType.EQUAL, lunchSplits, tripGroup.getId());

        // Expense 2: Bob pays ₹1500 for activities (UNEQUAL split)
        List<Split> activitySplits = Arrays.asList(
            new Split(bob.getId(), 1000L),  // Bob covers ₹1000 himself
            new Split(alice.getId(), 250L), // Alice owes ₹250
            new Split(charlie.getId(), 250L) // Charlie owes ₹250
        );
        expenseService.addExpense(bob.getId(), 1500, "Activities", Expense.SplitType.UNEQUAL, activitySplits, tripGroup.getId());

        // Expense 3: Charlie pays ₹900 for cab (PERCENTAGE split)
        List<Split> cabSplits = Arrays.asList(
            new Split(alice.getId(), 40),  // Alice covers 40% (₹360)
            new Split(bob.getId(), 30),   // Bob covers 30% (₹270)
            new Split(charlie.getId(), 30) // Charlie covers 30% (₹270)
        );
        expenseService.addExpense(charlie.getId(), 900, "Cab", Expense.SplitType.PERCENTAGE, cabSplits, tripGroup.getId());

        // Print Balance Sheets
        System.out.println("\n💰 Alice's Balance Sheet: " + expenseService.getUserBalances(alice.getId()));
        System.out.println("💰 Bob's Balance Sheet: " + expenseService.getUserBalances(bob.getId()));
        System.out.println("💰 Charlie's Balance Sheet: " + expenseService.getUserBalances(charlie.getId()));
    }
}
