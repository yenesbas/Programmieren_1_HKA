/*
Aufgabe 2 a)
Es ist sinnvoll eine Superklasse Number zu haben, weil man unterschiedliche Ziele in Unterschiedlichen Number-typen hat.
Zum Beispiel es kann sein dass man nur mit ganzen Zahlen die weniger als eine Million arbeiten möchte.
Dafür passt Integer, welches eine Unterklasse von Number ist. Durch die Nutzung diese Unterklassen spart man von Datenspeicher,
weil man zum Beispiel keine Kommastellen hat.

c)
BigInteger wird benutzt für Zahlen ohne begrenzung der Größe
und BigDecimal kommazahlen mit beliebig vielen stellen hinter dem komma
 */
import java.math.BigInteger;
public class Aufgabe_2 {

    public static void main(String[] args) {
        //Atribute von Integer
        System.out.println(Integer.BYTES + " Bytes werden mit Integer gebraucht.");
        System.out.println("Integer hat den maximalen Wert = " + Integer.MAX_VALUE);
        System.out.println("Integer hat den minimalen Wert = " + Integer.MIN_VALUE);
        System.out.println("Es gibt " + Integer.SIZE + " bits für ein Integer Wert.");
        System.out.println("Integer Datentyp: " + Integer.TYPE);

        String space = "-".repeat(50);
        System.out.println(space);

        alle4Methoden(100);
        System.out.println(space);
        alle4Methoden(-100);


        // BigInteger und BigDecimal
        BigInteger result = berechneFakultaet(BigInteger.valueOf(20));
        System.out.println("Fakultät von 20: " + result);
    }

    public static void alle4Methoden(int x) {
        //bitCount
        int bits = Integer.bitCount(x);
        System.out.println("Man braucht " + bits + " Stück 1-bits für Zahl " + x);
        System.out.println("");
        //rotateLeft
        System.out.println("rotateLeft:");
        System.out.println("Alle 1-bits werden einmal nach links verschoben:");
        System.out.println(Integer.toBinaryString(x) + " --> " + Integer.toBinaryString(Integer.rotateLeft(x, 1)));
        System.out.println(x + " --> " + Integer.rotateLeft(x, 1));

        System.out.println("");
        //rotateRigth
        System.out.println("rotateRigth:");
        System.out.println("Alle 1-bits werden einmal nach rechts verschoben:");
        System.out.println(Integer.toBinaryString(x) + " --> " + Integer.toBinaryString(Integer.rotateRight(x, 1)));
        System.out.println(x + " --> " + Integer.rotateRight(x, 1));

        System.out.println("");
        //numbersOfTrailingZeros
        System.out.println("numbersOfTrailingZeros:");
        System.out.println("Die Anzahl der Nullen auf der rechten Seite der Zahl " + x + " im Binärsystem beträgt " + Integer.numberOfTrailingZeros(x));
        System.out.println(x + " in Binärsystem: " + Integer.toBinaryString(x));

        System.out.println("");
        //reverse
        System.out.println("reverse:");
        System.out.println(Integer.toBinaryString(x) + " --> " + Integer.toBinaryString(Integer.reverse(x)));
        System.out.println(x + " --> " + Integer.reverse(x));
    }

    // BigInteger für Fakultätsfunktion
    public static BigInteger berechneFakultaet(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(berechneFakultaet(n.subtract(BigInteger.ONE)));
        }
    }
}
