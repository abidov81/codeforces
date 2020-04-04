import java.util.Scanner;

public class Problem785A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        n = scanner.nextInt();
        while (n > 0) {
            String s = scanner.next();
            if (s.compareTo("Tetrahedron") == 0)
                sum += 4;
            else if (s.compareTo("Cube") == 0)
                sum += 6;
            else if (s.compareTo("Octahedron") == 0)
                sum += 8;
            else if (s.compareTo("Dodecahedron") == 0)
                sum += 12;
            else if (s.compareTo("Icosahedron") == 0)
                sum += 20;
            n--;
        }
        System.out.println(sum);
    }
}
