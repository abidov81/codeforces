import java.util.Scanner;

public class Problem734A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int won = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'A')
                won++;
            else
                won--;
        if (won > 0)
            System.out.println("Anton");
        else if (won < 0 )
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}
