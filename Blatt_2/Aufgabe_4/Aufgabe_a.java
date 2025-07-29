import java.util.Scanner;

public class Aufgabe_a {
    static double flaeche, halloumiGroesse, passendeStueck;
    static double durchmesser, laenge, breite;
    static double output;
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Was ist die Durchmesser des Grills?");
        durchmesser = scanner.nextDouble();
        System.out.println("Was ist die Länge des Halloumi?");
        laenge = scanner.nextDouble();
        System.out.println("Was ist die Breite des Halloumi?");
        breite = scanner.nextDouble();
        output = (double) Math.round(maxHalloumi(durchmesser, laenge, breite) * 1000) / 1000;
        System.out.println(output + " Stueck Halloumi passen auf den Grill.");
    }

    static double maxHalloumi(double d, double l, double b) {
        flaeche = Math.PI * Math.pow(d / 2, 2);
        halloumiGroesse = l * b;
        passendeStueck = flaeche / halloumiGroesse;
        return passendeStueck;
    }
}