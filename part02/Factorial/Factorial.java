package Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Give a number:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        int factorial = n;

        while (n > 2) {
            factorial = factorial * (n - 1);
            --n;
        }

        if (n == 0) {
            factorial = 1;
        }

        System.out.println("Factorial: " + factorial);
    }
}
