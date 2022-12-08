package com.javalessons.task3.task;

public class Calculator {

    private double loanAmount;  //обьем кредита "сумма займа"
    private double years;  //кол-во лет на которое беретс€ кредит
    private double interestRate; //процент банка ежегодный
    private double payment; //ежемес€чный платеж
    private double extraPayment; //дополнительный платеж

    private int month = 0;
    private double startingBalance;
    private double rateMonth; //мес€чный процент по кредиты



    public Calculator(double loanAmount, double years, double interestRate) {
        this (loanAmount, years, interestRate, 0.0);
    }

    public Calculator(double loanAmount, double years, double interestRate, double extraPayment) {
        this.loanAmount = loanAmount;
        this.years = years;
        this.interestRate = interestRate;
        this.extraPayment = extraPayment;
        this.rateMonth = years/12;
    }

    public void PaymentCalculation(double pv) {
        double r = interestRate/12;
        this.payment = (pv * (r))/(1 - Math.pow(1 + r, years*12));
    }


}
