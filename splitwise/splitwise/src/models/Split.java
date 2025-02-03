package models;

public class Split {
    private String userId;
    private double amount;   // Used for UNEQUAL
    private int percentage; // Used for PERCENTAGE

    public Split(String userId, double amount, int percentage) {
        this.userId = userId;
        this.amount = amount;
        this.percentage = percentage;
    }

    public Split(String userId, double amount) {
        this.userId = userId;
        this.amount = amount;
    }

    public Split(String userId, int percentage) {
        this.userId = userId;
        this.percentage = percentage;
    }

    public void calculateAmount(double totalAmount) {
        if (percentage > 0) {
            amount = (percentage / 100.0) * totalAmount;
        }
    }

    public double getAmount() {
        return amount;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getUserId() {
        return userId;
    }
}
