package models;

import java.util.List;

public class Expense {
    public enum SplitType { EQUAL, UNEQUAL, PERCENTAGE }

    private final String id;
    private final String createdBy;
    private final double amount;
    private final String description;
    private final String groupId;  // Nullable if it's not a group expense
    private final SplitType splitType;
    private final List<Split> splitDetails;

    public Expense(String id, String createdBy, double amount, String description, 
                   SplitType splitType, List<Split> splitDetails, String groupId) {
        this.id = id;
        this.createdBy = createdBy;
        this.amount = amount;
        this.description = description;
        this.splitType = splitType;
        this.splitDetails = splitDetails;
        this.groupId = groupId;
    }

    public void validate() {
        if (splitType == SplitType.UNEQUAL) {
            double totalSplitAmount = splitDetails.stream().mapToDouble(Split::getAmount).sum();
            if (Double.compare(totalSplitAmount, amount) != 0) {
                throw new IllegalArgumentException("Split amounts must sum up to total expense amount");
            }
        } else if (splitType == SplitType.PERCENTAGE) {
            double totalPercentage = splitDetails.stream().mapToDouble(Split::getPercentage).sum();
            if (Double.compare(totalPercentage, 100.0) != 0) {
                throw new IllegalArgumentException("Split percentages must sum up to 100%");
            }
            splitDetails.forEach(split -> split.calculateAmount(amount));
        }
    }

    public String getCreatedBy() { return createdBy; }
    public List<Split> getSplitDetails() { return splitDetails; }
}
