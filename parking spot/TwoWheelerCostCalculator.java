public class TwoWheelerCostCalculator extends CostCalculator {
    public TwoWheelerCostCalculator() {
        super(new HourlyPricingStrategy());
    }
}
