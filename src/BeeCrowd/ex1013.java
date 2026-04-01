package BeeCrowd;
import java.util.Scanner;
/**
 * Amanhã a explicação
 */
public class ex1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int abs = (a + b + Math.abs(a - b)) / 2;

        System.out.println(c > abs ? c + "eh o maior" : null);

    }
}
