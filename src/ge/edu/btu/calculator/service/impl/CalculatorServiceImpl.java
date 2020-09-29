package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    public int sum(int x, int y) {
        int sum = x+y;
        return sum;
    }

    public int divide(int x, int y) {
        try {
            int division = x / y;
            return division;
        }
        catch (ArithmeticException exp){
            System.out.println("Division by zero.");
            return 0;
        }
    }

    public double sum(double x, double y) {
        double sum = x+y;
        return sum;
    }

    public double divide(double x, double y) {
        try {
            double division = x / y;
            return division;
        }
        catch (ArithmeticException exp){
            System.out.println("Division by zero.");
            return 0;
        }
    }
}
