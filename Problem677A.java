import java.util.Scanner;

public class Problem677A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        int width = n;
        for (int i = 0; i < n; i++)
            if (a[i] > h)
                width++;
        System.out.println(width);
    }
}
