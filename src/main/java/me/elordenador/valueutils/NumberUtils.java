package me.elordenador.valueutils;

public class NumberUtils {
    public void generateRandomNumberOfDigits(int numberOfDigits) {
        int number = 0;
        for (int i = 1; i <= numberOfDigits; i++) {
            number = number * 10 + (int) (Math.random() * 10);
        }
    }
}
