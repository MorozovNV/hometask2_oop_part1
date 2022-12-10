package com.javalessons.task3.task;


public class MortgageCalc {

    public static void main(String[] args) {
        Calculator a  = new Calculator(100_000,30,0.06);
        System.out.println(a);
        System.out.println("Payment = " + a.getPayment() + " y.e.");
        a.outLegend();
        a.outCalc();
        a.calculationThisPeriod();
        a.outCalc();
        a.calculationThisPeriod();
        a.outCalc();
        a.calculationRemainingPeriod();



    }
}
