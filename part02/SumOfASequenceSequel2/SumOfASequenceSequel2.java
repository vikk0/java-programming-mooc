package SumOfASequenceSequel2;

import java.util.Scanner;

class SumOfASequenceSequel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int numFirst = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");
        int numLast = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        while (numFirst <= numLast) {
            sum += numFirst;
            numFirst++;
        }

        System.out.println(sum);
    }
}
