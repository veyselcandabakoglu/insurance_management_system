public class ResidenceInsurance extends Insurance {
    
    public ResidenceInsurance(String insName, double insPrice) {
        super(insName, insPrice);
    }

    @Override
    public double calculate() {
        return this.getInsPrice() * 0.05;
    }
}
