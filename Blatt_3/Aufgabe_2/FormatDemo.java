import java.math.BigDecimal;

public class FormatDemo {
    static String binaryString, zero, nullen;
    static int anzahlNullen;

    public static void main(String[] args) {
        intFormatDemo(100);
        intFormatDemo(1023);
        intFormatDemo(0xFFF1234);
        intFormatDemo(-3);

        doubleFormatDemo(2.5);
        /*
        Berechnung von Ausgabe (0x1.4P1) nach Dezimal (2.5)
        1.4 ist Mantisse
        P1 bedeutet Exponent = 1
        unsere form ist 0xM * 2hochE
        1.4 ist 1 + 4 * (1/16)hoch1= 1,25
        2hoch1 = 2
        1,25 * 2 = 2,5
         */
        doubleFormatDemo(3.141592653);
        doubleFormatDemo(1e12);
        doubleFormatDemo(-0.0001234);
    }

    static void intFormatDemo(int x) { //fertig
        System.out.println("-".repeat(34) + "\n" + x);

        // Mit Vorzeichen
        if (x > 0) {
            System.out.println("+" + x);
        } else {
            System.out.println(x);
        }

        // Als 8 Stellige Hexadezimalzahl
        anzahlNullen = 8 - Integer.toHexString(x).length();
        zero = "0";
        nullen = "";
        for (int i = 0; i < anzahlNullen; i++) {
            nullen = zero + nullen;
        }
        System.out.println("0x" + nullen + Integer.toHexString(x).toUpperCase());

        // Als 32 Stellige Zahl im Binar System
        binaryString = Integer.toBinaryString(x);
        int binaryLaenge = 32 - binaryString.length();
        String formatedBinary = " ".repeat(binaryLaenge) + binaryString;
        formatedBinary = formatedBinary.replace(" ", "0");
        System.out.println("0b" + formatedBinary);

        // linksbündig (10 Zeichen)
        String linksbuendig = String.format("[%10d]", x);
        System.out.println(linksbuendig);
        //rechsbündig (10 Zeichen)
        System.out.printf("[%-10d]%n", x); // %n ist für Zeilenumbruch
    }


    static void doubleFormatDemo(double d) { //fertig
        System.out.println("-".repeat(25) + "\n" + d);

        String fliesskommaFormat = String.format("%25.2f", d);
        System.out.println(fliesskommaFormat);

        String wissenNotation = String.format("%25.2E", d);
        System.out.println(wissenNotation);

        String hexExponential = String.format("%25a", d).toUpperCase();
        System.out.println(hexExponential);
    }


    /*
    Ab hier gibt es zwei andere Methoden,
    die ganze Zahlen zu Binär konventieren.
    Man muss für die gegebene Aufgaben es mit
    der Methode "toBinaryString" machen. Sie
    können während der Präsentation ignoriert
    werden.
     */

    static void setToBinar(int toBinar) {
        int[] binarStellen = null;
        for (int i = 7; i >= 0; i--) {
            if (toBinar >= Math.pow(2, i)) {
                binarStellen[i] = 1;
                toBinar -= Math.pow(2, i);
            } else {
                binarStellen[i] = 0;
            }
        }
        String binarString = "Binär: ";
        for (int i = 7; i >= 0; i--) {
            binarString += Integer.toString(binarStellen[i]);
        }
    }

    static void setToBinarNeg(int toBinar) {
        int[] binarStellen = null;
        for (int i = 7; i >= 0; i--) {
            if (toBinar >= Math.pow(2, i)) {
                binarStellen[i] = 0;
                toBinar -= Math.pow(2, i);
            } else {
                binarStellen[i] = 1;
            }
        }
        String binarString = "Binär: ";
        for (int i = 7; i >= 0; i--) {
            binarString += Integer.toString(binarStellen[i]);
        }
    }
}