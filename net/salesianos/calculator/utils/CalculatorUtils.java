package calculator.utils;

import java.util.Scanner;

public class CalculatorUtils {
    
    public static Scanner scanner = new Scanner(System.in);

    public static int factorial(int factorialNumber){
        int outputNumber = 1;
        
        for (int i = 0; i < factorialNumber; i++) {
            outputNumber *= (i+1);
        }

        return outputNumber;
    }

    public static float mean(float meanNumber){
        float outputNumber = 1f;
        
        for (int i = 0; i < meanNumber; i++) {
            outputNumber += (i+1);
        }
        outputNumber = (outputNumber/meanNumber);

        return outputNumber;
    }

    public static String fibonacci(int fibonacciNumber){
        
        int outputNumbers[] = new int[fibonacciNumber];
        outputNumbers[0] = 0;
        outputNumbers[1] = 1;

        for (int i = 2; i < outputNumbers.length; i++) {
            outputNumbers[i] = outputNumbers[(i-1)] + outputNumbers[(i-2)];
        }
        
        String msg = "";

        for (int i = 0; i < outputNumbers.length; i++) {
            msg += outputNumbers[i] + ", ";
        }

        return msg;
    }

}

