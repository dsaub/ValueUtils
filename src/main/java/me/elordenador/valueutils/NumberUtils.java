package me.elordenador.valueutils;

public class NumberUtils {
    public static int generateRandomNumberOfDigits(int numberOfDigits) {
        int number = 0;
        for (int i = 1; i <= numberOfDigits; i++) {
            number = number * 10 + (int) (Math.random() * 10);
        }
        return number;
    }
    public static int generateRandomNumber() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
    public static int generateRandomNumber(int max) {
        return (int) (Math.random() * max);
    }
    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
    public static int generateRandomNumber(int min, int max, int step) {
        return (int) (Math.random() * ((max - min) / step + 1)) * step + min;
    }
    public static int generateRandomNumber(int min, int max, int step, int[] exclude) {
        int number = generateRandomNumber(min, max, step);
        for (int i = 0; i < exclude.length; i++) {
            if (number == exclude[i]) {
                return generateRandomNumber(min, max, step, exclude);
            }
        }
        return number;
    }
    public static int generateRandomNumber(int min, int max, int step, int[] exclude, int[] include) {
        int number = generateRandomNumber(min, max, step);
        for (int i = 0; i < exclude.length; i++) {
            if (number == exclude[i]) {
                return generateRandomNumber(min, max, step, exclude, include);
            }
        }
        for (int i = 0; i < include.length; i++) {
            if (number != include[i]) {
                return generateRandomNumber(min, max, step, exclude, include);
            }
        }
        return number;
    }



}
