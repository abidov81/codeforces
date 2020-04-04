import java.util.Scanner;

public class Problem344A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++)
            strings[i] = scanner.next();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (strings[i].charAt(0) == strings[i + 1].charAt(1))
                count++;
        }
        System.out.println(count + 1);
    }
}
