package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.Main;
import ge.edu.btu.calculator.service.CalculatorService;
import org.apache.log4j.Logger;

public class CalculatorServiceImpl implements CalculatorService {
    final static Logger logger=Logger.getLogger(Main.class);

    public void sum(int x, int y) {
        int sum = x+y;
        System.out.println("Sum of integers: " + sum);
        logger.info("Sum of integers: " + sum);
    }

    public void divide(int x, int y) {
        try {
            int division = x / y;
            System.out.println("Division of integers: " + division);
            logger.info("Division of integers: " + division);
        }
        catch (ArithmeticException exp){
            System.out.println("Division by zero.");
            logger.error("Division by zero.");
        }
    }

    public void sum(double x, double y) {
        double sum = x+y;
        System.out.println("Sum of doubles: " + sum);
        logger.info("Sum of doubles: " + sum);
    }

    public void divide(double x, double y) {
        try {
            double division = x / y;
            System.out.println("Division of doubles: " + division);
            logger.info("Division of doubles: " + division);
        }
        catch (ArithmeticException exp){
            System.out.println("Division by zero.");
            logger.error("Division by zero.");
        }
    }
}
