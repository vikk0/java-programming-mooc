package DivisibleByThree;

public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeRange(2, 10);
    }

    public static void divisibleByThreeRange(int x, int y) {
        for (int i = x; i <= y; ++i) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
