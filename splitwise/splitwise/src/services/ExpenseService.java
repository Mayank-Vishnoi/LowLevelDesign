package services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import models.BalanceSheet;
import models.Expense;
import models.Split;

public class ExpenseService {
    private Map<String, Expense> expenses = new HashMap<>();
    private Map<String, BalanceSheet> balanceSheets = new HashMap<>();

    public void addExpense(String createdBy, double amount, String description, 
                           Expense.SplitType splitType, List<Split> splitDetails, String groupId) {
        String expenseId = UUID.randomUUID().toString();
        Expense expense = new Expense(expenseId, createdBy, amount, description, splitType, splitDetails, groupId);
        expense.validate();

        expenses.put(expenseId, expense);
        updateBalances(expense);
    }

    private void updateBalances(Expense expense) {
        String creatorId = expense.getCreatedBy();
        for (Split split : expense.getSplitDetails()) {
            String userId = split.getUserId();
            double amountOwed = split.getAmount();
            
            balanceSheets.putIfAbsent(creatorId, new BalanceSheet());
            balanceSheets.putIfAbsent(userId, new BalanceSheet());

            balanceSheets.get(creatorId).updateBalance(userId, amountOwed);
            // Creator paid, so deduct from their balance
            balanceSheets.get(userId).updateBalance(creatorId, -amountOwed);
        }
    }

    public Map<String, Double> getUserBalances(String userId) {
        return balanceSheets.getOrDefault(userId, new BalanceSheet()).getBalances();
    }
}
