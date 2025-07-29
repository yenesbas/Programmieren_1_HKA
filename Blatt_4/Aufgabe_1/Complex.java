public class Complex {
    private double realTeil, imaginaerTeil;

    public Complex(double a, double b) {
        this.realTeil = a;
        this.imaginaerTeil = b;
    }

    public Complex() {
        this.realTeil = 0.0;
        this.imaginaerTeil = 0.0;
    }

    Complex add(Complex other) {
        double a = this.realTeil, b = this.imaginaerTeil;
        double c = other.realTeil, d = other.imaginaerTeil;
        double realErgebnis = a + c;
        double imaginaerErgebnis = (b + d);
        return new Complex(realErgebnis, imaginaerErgebnis);
    }

    public Complex sub(Complex other) {
        double a = this.realTeil, b = this.imaginaerTeil;
        double c = other.realTeil, d = other.imaginaerTeil;
        double realErgebnis = a - c;
        double imaginaerErgebnis = (b - d);
        return new Complex(realErgebnis, imaginaerErgebnis);
    }

    public Complex mul(Complex other) {
        double a = this.realTeil, b = this.imaginaerTeil;
        double c = other.realTeil, d = other.imaginaerTeil;
        double realErgebnis = (a * c - b * d);
        double imaginaerErgebnis = (a * d - b * c);
        return new Complex(realErgebnis, imaginaerErgebnis);
    }

    public Complex div(Complex other) {
        double a = this.realTeil, b = this.imaginaerTeil;
        double c = other.realTeil, d = other.imaginaerTeil;
        double v = Math.pow(c, 2) + Math.pow(d, 2);
        double realErgebnis = (a * c - b * d) / v;
        double imaginaerErgebnis = ((b * c - a * d) / v);
        return new Complex(realErgebnis, imaginaerErgebnis);
    }

    public String toString() {
        String realT = Double.toString(realTeil);
        String imagiT = Double.toString(imaginaerTeil);
        String negImagT = Double.toString(-imaginaerTeil);
        if (imaginaerTeil == 0) {
            return realT;
        }
        if (realTeil == 0) {
            return imagiT + "i";
        }
        if (imaginaerTeil < 0) {
            return realT + " - " + negImagT + "i";
        }
        return realT + " + " + imagiT + "i";
    }

    public boolean equals(Complex other) {
        if (this.realTeil == other.realTeil && this.imaginaerTeil == other.imaginaerTeil) {
            return true;
        } else {
            return false;
        }
    }
}
