package ge.edu.btu.calculator;

import ge.edu.btu.calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        calculatorService.divide(5,0);
        calculatorService.divide(11.5,2);
        calculatorService.sum(5,5);
        calculatorService.sum(5.9, 1);
    }
}
