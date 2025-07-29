import java.util.Scanner;

public class Aufgabe_b {
    static double durchmesser, laenge, breite;
    static double flaeche;
    static double halloumiGroesse, passendeStueck, halloumiZahl;
    static double fuellung, output;
    static Scanner scanner;
    static int erwachsene;
    static int kinder;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        messungen();
        scannen();
        rechnen();
    }

    static void messungen() {
        System.out.println("Was ist die Durchmesser des Grills?");
        durchmesser = scanner.nextDouble();
        System.out.println("Was ist die Länge des Halloumi?");
        laenge = scanner.nextDouble();
        System.out.println("Was ist die Breite des Halloumi?");
        breite = scanner.nextDouble();
        output = (double) Math.round(maxHalloumi(durchmesser, laenge, breite) * 1000) / 1000;
    }

    static double maxHalloumi(double durchmesser, double laenge, double breite) {
        flaeche = Math.PI * Math.pow(durchmesser / 2, 2);
        halloumiGroesse = laenge * breite;
        passendeStueck = flaeche / halloumiGroesse;
        return passendeStueck;
    }

    static void scannen() {
        System.out.println("Wie viele Erwachsene essen Halloumi?");
        erwachsene = scanner.nextInt();
        System.out.println("Wie viele Kinder essen Halloumi?");
        kinder = scanner.nextInt();
        halloumiZahl = kinder + erwachsene;
    }

    static void rechnen() {
        fuellung = halloumiZahl / output;
        System.out.println("Man muss " + (int) Math.floor(fuellung) + " mal der Grill vollstaendig befüllen.\nGuten Appetit!");
    }
}