package com.javalessons.task3.task;

public class Calculator {

    private double loanAmount;  //����� ������� "����� �����"
    private double years;  //���-�� ��� �� ������� ������� ������
    private double interestRate; //������� ����� ���������
    private double payment; //����������� ������
    private double extraPayment; //�������������� ������

    private int month = 0;
    private double startingBalance;
    private double rateMonth; //�������� ������� �� �������



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
