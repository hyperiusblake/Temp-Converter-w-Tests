package com.hyperiusblake;
import java.util.Scanner;

//C = (F-32) * 5/9
//F = (C * 9/5) + 32

public class Main {

    public static int fahrToCel(double temp) {
        double result;
        result = (temp - 32) * 5/9;
        return (int) result;
    }

    public static double fahrToKel(double temp) {
        double result;
        result = ((temp - 32) * 5/9 + 273.15);
        return result;
    }

    public static int celToFahr(double temp) {
        int result;
        result = (int) ((temp * 9/5) + 32);
        return result;
    }

    public static double celToKel (double temp) {
        double result;
        result = temp + 273.15;
        return result;
    }

    public static double kelToFahr (double temp) {
        double result;
        result = (temp - 273.15) * 9/5 + 32;
        return result;
    }

    public static double kelToCel (double temp) {
        double result;
        result = (temp - 273.15);
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter! Please enter F for Fahrenheit, C for Celsius, or K for Kelvin.");
        String input = scanner.next();

        //if F then do - if C then do - if not F or C then do
        switch (input) {
            case "F", "f" -> {
                System.out.println("Enter the temperature you wish to convert.");
                double temp = scanner.nextDouble();
                System.out.println("Your result is: " + fahrToCel(temp) + " degrees in Celsius, and " + fahrToKel(temp) + " in Kelvin.");
                break;
            }
            case "C", "c" -> {
                System.out.println("Enter the temperature you wish to convert.");
                double temp = scanner.nextDouble();
                System.out.println("Your result is: " + celToFahr(temp) + " degrees in Fahrenheit, and " + celToKel(temp) + " in Kelvin.");
                break;
            }
            case "K", "k" -> {
                System.out.println("Enter the temperature you wish to convert.");
                double temp = scanner.nextDouble();
                System.out.println("Your result is: " + kelToFahr(temp) + " degrees in Fahrenheit, and " + kelToCel(temp) + " in Celsius.");
                break;
            }
            default -> System.out.println("Invalid response.");
        }




    }
}
