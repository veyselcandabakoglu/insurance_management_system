public class HealthInsurance extends Insurance {
    
    public HealthInsurance(String insName, double insPrice) {
        super(insName, insPrice);
    }

    @Override
    public double calculate() {
        return this.getInsPrice() * 0.075;
    }
}
