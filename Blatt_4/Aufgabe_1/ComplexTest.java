public class ComplexTest {
    public static void main(String[] args) {
        Complex a = new Complex(33, 2);
        Complex b = new Complex(12, 0);
        Complex c = new Complex(34.2, 2);
        System.out.println(a.add(b)); // 33 + 12 = 45   2 + 0 = 2   45+2i
        System.out.println(a.mul(b)); // 33 * 12 - 12 * 0 = 396  33 * 0 - 2 * 12 = -24   396+(-24)i
        System.out.println(a.equals(b));
        System.out.println(a.div(c));
        /* (33 * 34.2 - 2 * 2)/Math.pow(34.2,2) + Math.pow(2,2) = 1124,6/1173,64 = 0,9582154664121877
         (2 * 34,2 - 33 * 2)/Math.pow(34.2,2) + Math.pow(2,2) = 2,4/1173,64 = 0,002044920077706963
         */

        // Testen der Multiplikation von i mit i (i * i)
        Complex i = new Complex(0, 1);
        Complex result = i.mul(i);
        Complex expected = new Complex(-1, 0);
        System.out.print("Test für i * i: ");
        if (result.equals(expected)) {
            System.out.println("Ok");
        } else {
            System.out.println("FAILED: expected " + expected + ", got " + result);
        }
    }
}
