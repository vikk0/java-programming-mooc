package StarSign;

public class StarSign {
    public static void printStars(int number) {
        for (int i = 0; i < number; ++i) {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void printSquare(int number) {
        for (int i = 0; i < number; ++i) {
            printStars(number);
        }
    }

    public static void printRectangle(int width, int height) {
         if (width == 0) {
            return;
        }
        for (int i = 0; i < height; ++i) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(15, 3);
        printTriangle(5);
    }
}
