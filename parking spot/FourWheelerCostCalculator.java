public class FourWheelerCostCalculator extends CostCalculator {
    public FourWheelerCostCalculator() {
        super(new MinutesPricingStrategy());
    }
}