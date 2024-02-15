public class TravelInsurance extends Insurance {
    
    public TravelInsurance(String insName, double insPrice) {
        super(insName, insPrice);
    }

    @Override 
    public double calculate() {
        return getInsPrice() * 0.02;
    }
}
