import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line of Pascal's Triangle to print: ");
        int n = scanner.nextInt();
        int[] line = getPascalLine(n);
        System.out.print("Line " + n + ": ");
        for (int num : line) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] getPascalLine(int n) {
        if (n == 0) {
            return new int[]{1};
        } else {
            int[] prevLine = getPascalLine(n - 1);
            int[] line = new int[n + 1];
            line[0] = line[n] = 1;
            for (int i = 1; i < n; i++) {
                line[i] = prevLine[i - 1] + prevLine[i];
            }
            return line;
        }
    }
}

    