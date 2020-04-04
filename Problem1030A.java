import java.util.Scanner;

public class Problem1030A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        n = scanner.nextInt();
        while (n > 0) {
            sum += scanner.nextInt();
            n--;
        }
        if (sum > 0)
            System.out.println("HARD");
        else
            System.out.println("EASY");
    }
}
