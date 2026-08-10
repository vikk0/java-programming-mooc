package SumOfASequenceSequel;

import java.util.Scanner;

class SumOfASequenceSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int numFirst = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");
        int numLast = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = numFirst; i <= numLast; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}