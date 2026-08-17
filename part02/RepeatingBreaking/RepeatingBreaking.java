package RepeatingBreaking;

import java.util.Scanner;

public class RepeatingBreaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int numCount = 0;
        int oddCount = 0;
        int evenCount = 0;

        do {
            System.out.println("Give numbers:");
            n = Integer.valueOf(scanner.nextLine());

            if (n == -1) {
                continue;
            }

            if (n % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            numCount++;
            sum += n;
        } while (n != -1);

        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+ sum);
        System.out.println("Numbers: " + numCount);
        System.out.println("Average: " + ((double) sum / numCount));
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
