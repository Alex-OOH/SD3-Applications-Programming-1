package app_prog.ui;

public class Investment {
    private double monthlyInvestment;
    private double yearlyInterestRate;
    private int years;

    public Investment(double monthlyInvestment, double yearlyInterestRate, int years) {
        this.monthlyInvestment = monthlyInvestment;
        this.yearlyInterestRate = yearlyInterestRate;
        this.years = years;
    }

    public Investment() {
        this.monthlyInvestment = 0.0; // tut mi mojem zadat' startovie
        this.yearlyInterestRate = 0.0; //zna4eniya po umol4aniu v pustom konstruktore
        this.years = 0;
    }




    public double getMonthlyInvestment() {
        return monthlyInvestment;
    }

    public void setMonthlyInvestment(double monthlyInvestment) {
        this.monthlyInvestment = monthlyInvestment;
    }

    public double getYearlyInterestRate() {
        return yearlyInterestRate;
    }

    public void setYearlyInterestRate(double yearlyInterestRate) {
        this.yearlyInterestRate = yearlyInterestRate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}