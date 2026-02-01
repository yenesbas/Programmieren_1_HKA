public class Fakultat {
    // Iterative Fakultätsfunktion
    public static long fakultaetIterativ(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Rekursive Fakultätsfunktion
    public static long fakultaetRekursiv(int n) {
        if (n <= 1) return 1;
        return n * fakultaetRekursiv(n - 1);
    }

    public static void main(String[] args) {
        int n = 555; // Beispielwert

        long startIter = System.nanoTime();
        long resIter = fakultaetIterativ(n);
        long endIter = System.nanoTime();
        double timeIter = (endIter - startIter) / 1_000_000.0;
        System.out.println("Iterativ: " + n + "! = " + resIter + " (" + timeIter + " ms)");

        long startRek = System.nanoTime();
        long resRek = fakultaetRekursiv(n);
        long endRek = System.nanoTime();
        double timeRek = (endRek - startRek) / 1_000_000.0;
        System.out.println("Rekursiv: " + n + "! = " + resRek + " (" + timeRek + " ms)");
    }
}
