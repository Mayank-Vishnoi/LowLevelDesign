public abstract class CostCalculator {
    protected PricingStrategy pricingStrategy;

    public CostCalculator(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateCost(Ticket ticket) {
        return pricingStrategy.getPrice(ticket);
    }
}