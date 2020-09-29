package ge.edu.btu.calculator;

import ge.edu.btu.calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

        int sumOfIntegers = calculatorService.sum(5,6);
        System.out.println("Sum of integers: " + sumOfIntegers);

        double sumOfDoubles = calculatorService.sum(5.5,6.6);
        System.out.println("Sum of doubles: " + sumOfDoubles);

        int divisionOfIntegers = calculatorService.divide(10,0);
        System.out.println("Division of integers: " + divisionOfIntegers);

        double divisionOfDoubles = calculatorService.divide(11.0,3.0);
        System.out.println("Division of doubles: " + divisionOfDoubles);
    }
}
