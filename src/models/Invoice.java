package models;

public class Invoice {
    private double monthlyFee;
    private double Scholarship;
    private double transportation;

    public Invoice(double monthlyFee, double scholarship, double transportation) {
        this.monthlyFee = monthlyFee;
        Scholarship = scholarship;
        this.transportation = transportation;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public double getScholarship() {
        return Scholarship;
    }

    public void setScholarship(double scholarship) {
        Scholarship = scholarship;
    }

    public double getTransportation() {
        return transportation;
    }

    public void setTransportation(double transportation) {
        this.transportation = transportation;
    }
}
