package com.javalessons.task3.task;


public class MortgageCalc {

    public static void main(String[] args) {
        Calculator a  = new Calculator(100_000,10,0.05);
        System.out.println(a);
        a.outLegend();
        a.outCalc();
        a.outCalc();
        a.calculationThisPeriod();
        a.outCalc();
    }
}
