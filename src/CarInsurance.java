public class CarInsurance extends Insurance {
    
    public CarInsurance(String insName, double insPrice) {
        super(insName, insPrice);
    }

    @Override 
    public double calculate() {
        return getInsPrice() * 0.01;
    }
}
