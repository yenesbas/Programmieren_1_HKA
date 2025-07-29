import java.util.Scanner;

public class Heron10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie bitte eine positive Zahl ein: ");

        double a = sc.nextDouble();
        double x = a;
        System.out.println("x0 " + " = " + a);

        for (int i = 1; i <= 10; i++) {
            x = 0.5 * (x + a / x);
            System.out.println("x" + i + " = " + x);
        }
        sc.close();
    }

}
//b) ja, Zahl über eine Million
