import java.time.LocalDate;

public abstract class Insurance {
    private String insName;
    private double insPrice;
    private LocalDate startDate;
    private LocalDate endDate;

    public Insurance(String insName, double insPrice) {
        this.insName = insName;
        this.insPrice = insPrice;
        this.startDate = LocalDate.now();
        this.endDate = startDate.plusYears(1);
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public double getInsPrice() {
        return insPrice;
    }

    public void setInsPrice(double insPrice) {
        this.insPrice = insPrice;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public abstract double calculate();
    
}
