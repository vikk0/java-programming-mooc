package Factorial2;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        int n = Integer.valueOf(scanner.nextLine());
        System.out.println(Factorial(n));
    }

    static int Factorial(int n) {
        if (n < 2) {
            return 1;
        }
        int result;

        result = n * Factorial(n - 1);
        return result;
    }
}
