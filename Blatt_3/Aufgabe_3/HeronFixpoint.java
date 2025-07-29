import java.util.Scanner;

public class HeronFixpoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie eine positive Zahl ein: ");
        double a = scanner.nextDouble();

        double x = a;
        double previous_x;

        do {
            previous_x = x;
            x = 0.5 * (x + a / x);
            System.out.println("x = " + x);
        } while (Math.abs(x - previous_x) >= 0.000001); // Schleife läuft, bis xn+1 = xn gilt

        System.out.println("Fixpunkt der Rekursionsgleichung: x = " + x);

        scanner.close();
    }
}

//d) Nein, das Programm terminiert wegen Datenspeicher d.h. Begrenzung von nachkommastellen.