import java.util.Scanner;

public class Problem617A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;
        while (x > 0) {
            if (x >= 5) {
                count = x / 5;
                x %= 5;
            }
            else if ((x == 4) || (count == 3) || (count == 2)) {
                count++;
                x = 0;
            }
            else {
                count += 1;
                x = 0;
            }
        }
        System.out.println(count);
    }
}
