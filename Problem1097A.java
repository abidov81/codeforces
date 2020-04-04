import java.util.Scanner;

public class Problem1097A {
    public static void main(String[] args) {
        char[] suit = new char[6]; //масть
        char[] rank = new char[6]; //достоинство
        Scanner scanner = new Scanner(System.in);
        String temp;
        boolean found = false;
        temp = scanner.nextLine();
        rank[0] = temp.charAt(0);
        suit[0] = temp.charAt(1);
        for (int i = 1; i < 6; i++) {
            temp = scanner.next();
            rank[i] = temp.charAt(0);
            suit[i] = temp.charAt(1);
            if ((rank[0] == rank[i]) || (suit[0] == suit[i]))
                found = true;
        }
        System.out.println( found ? "YES" : "NO");
    }
}
