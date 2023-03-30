package calculator;

import calculator.utils.CalculatorUtils;

public class MainCalculator {
    public static void main(String[] args) {

        System.out.println("Solicite el número del que desea realizar el factorial");
        int factorialNumber = Integer.parseInt(CalculatorUtils.scanner.nextLine());
        System.out.println("El factorial de " + factorialNumber + " es: " + CalculatorUtils.factorial(factorialNumber));

        System.out.println("Solicite el número del que desea realizar la media");
        float meanNumber = Float.parseFloat(CalculatorUtils.scanner.nextLine());

        System.out.println("La media de " + meanNumber + " es: " + CalculatorUtils.mean(meanNumber));

        System.out.println("Indique cuantos pasos desea conocer de la cadena de Fibonacci");
        int fibonacciNumber = Integer.parseInt(CalculatorUtils.scanner.nextLine());

        System.out.println("Los primeros " + fibonacciNumber + " pasos de la cadena Fibonacci son: " + CalculatorUtils.fibonacci(fibonacciNumber));
    }
}

