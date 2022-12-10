package com.javalessons.task3.task;

public class Calculator {

    private double loanAmount;  //����� ������� "����� �����"
    private double years;  //���-�� ��� �� ������� ������� ������
    private double interestRate; //������� ����� ���������
    private double payment; //����������� ������
    private double extraPayment; //�������������� ������

    private int month = 0;
    private double startingBalance;
    private double endingBalance;
    private double rateMonth; //�������� ������� �� �������
    private double interest; //����� ����� ��������
    private double principal; //����� ����� �� ���������
    private double totalInterest; //����� �����������



    public Calculator(double loanAmount, double years, double interestRate) {
        this (loanAmount, years, interestRate, 0.0);
    }

    public Calculator(double loanAmount, double years, double interestRate, double extraPayment) {
        this.loanAmount = loanAmount;
        this.years = years;
        this.interestRate = interestRate;
        this.extraPayment = extraPayment;
        this.rateMonth = interestRate/12;
        this.payment = PaymentCalculation(loanAmount);
        this.startingBalance = loanAmount;
        this.endingBalance = loanAmount;

    }

    void calculationThisPeriod() {
        month++;
        startingBalance = endingBalance;
        interest = startingBalance * rateMonth;
        principal = payment + extraPayment - interest;
        endingBalance = startingBalance - principal;
        totalInterest += interest;
    }

    void calculationRemainingPeriod() {
        int monthNow = month;
        for (int i=0; i < (years*12 - monthNow); i++) {
            calculationThisPeriod();
            outCalc();
        }
    }

    public double getPayment() {
        return payment;
    }

    double PaymentCalculation(double pv) {
        return pv * rateMonth / (1 - Math.pow(1 + rateMonth, - 1 * years * 12));
    }

    public void outLegend() {
        System.out.println("Month | StartingBalance | Payment | Interest | Principal | EndingBalance | TotalInterest |");
    }

    public void outCalc() {
        System.out.printf("%d, %15.2f, %12.2f, %8.2f, %8.2f, %15.2f, %15.2f%n", month, startingBalance,
                payment, interest, principal, endingBalance, totalInterest);
    }

    @Override
    public String toString() {

        return "Calculator{" +
                "month=" + month +
                ", payment=" + payment +
                ", startingBalance=" + startingBalance +
                ", endingBalance=" + endingBalance +
                ", interest=" + interest +
                ", principal=" + principal +
                ", totalInterest=" + totalInterest +
                '}';
    }

}
