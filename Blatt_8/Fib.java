public class Fib {
	// Iterative Fibonacci-Funktion
	public static int fibonacciIterativ(int n) {
		if (n <= 1) return n;
		int a = 0, b = 1;
		for (int i = 2; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}

	// Rekursive Fibonacci-Funktion
	public static int fibonacciRekursiv(int n) {
		if (n <= 1) return n;
		return fibonacciRekursiv(n - 1) + fibonacciRekursiv(n - 2);
	}

	public static void main(String[] args) {
		int n = 10; // Beispielwert

		long startIter = System.nanoTime();
		int fibIter = fibonacciIterativ(n);
		long endIter = System.nanoTime();
		double timeIter = (endIter - startIter) / 1_000_000.0;
		System.out.println("Iterativ: Fibonacci(" + n + ") = " + fibIter + " (" + timeIter + " ms)");

		long startRek = System.nanoTime();
		int fibRek = fibonacciRekursiv(n);
		long endRek = System.nanoTime();
		double timeRek = (endRek - startRek) / 1_000_000.0;
		System.out.println("Rekursiv: Fibonacci(" + n + ") = " + fibRek + " (" + timeRek + " ms)");
	}
}
