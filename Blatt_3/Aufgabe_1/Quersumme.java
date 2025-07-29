import java.util.Scanner;

class Quersumme {
    static Scanner scanner;
    static int zDrei, hexZahl;
    static String hexStelle;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine natürliche Zahl die kleiner als 1000 ist: ");
        zDrei = scanner.nextInt();
        System.out.print("Geben Sie eine Hexadezimal Zahl ein: ");
        hexZahl = scanner.nextInt(16);
        hexStelle = Integer.toString(hexZahl);

        if (zDrei <= 999 && zDrei >= 0) {
            System.out.println("Quersumme von " + zDrei + " betraegt " + quersumme(zDrei));
        } else {
            System.out.println(zDrei + " ist nicht in Definitionsbereich");
        }
        System.out.println("Quersumme Hexadezimal von " + Integer.toHexString(hexZahl).toUpperCase() + " betraegt " + Integer.toHexString(quersummeHex(hexZahl)).toUpperCase());

    }


    public static int quersumme(int x) {
        int i = 0;
        while (x != 0) {
            i = i + (x % 10);
            x /= 10;
        }
        return i;
    }

    public static int quersummeHex(int x) {
        int k = 0;
        while (x != 0) {
            k = k + (x % 16);
            x /= 16;
        }
        return k;
    }
}

