import java.util.Scanner;

public class Aufgabe_5a {
    static Scanner scanner;
    static double geschwindigkeit, bremsWeg;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Wie schnell sind Sie?");
        geschwindigkeit = scanner.nextDouble();
        bremsWeg = Math.pow(geschwindigkeit , 2)/100;
        System.out.println("Ihre Bremsweg betraegt " + bremsWeg + " Meter.");
    }
}