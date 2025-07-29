import java.util.Scanner;

public class Aufgabe_5b {
    static Scanner scanner;
    static double geschwindigkeit, bremsWeg, gegenBeispiel2;
    static int gegenBeispiel1;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Wie schnell sind Sie?");
        geschwindigkeit = scanner.nextDouble();
        bremsWeg = Math.pow(geschwindigkeit , 2)/100;
        gegenBeispiel1 = (int) Math.pow(((int) geschwindigkeit / 10), 2);
        gegenBeispiel2 = Math.pow(geschwindigkeit, 2) / 10;
        System.out.println("Ihre Bremsweg betraegt " + bremsWeg + " Meter.");
        System.out.println("Gegenbeispiel (DataType): " + gegenBeispiel1);
        System.out.println("Gegenbeispiel (Berechnungsschritte):" + gegenBeispiel2);
    }
}