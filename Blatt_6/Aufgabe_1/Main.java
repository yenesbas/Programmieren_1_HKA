public class Main{
    public static void main (String[] args ){


            // Erstellen der Fahrräder
            Bike rennrad = new Bike("Rotes Rennrad", new Rahmen("Carbon", "Rot"),
                    new Bremsen("Felgenbremsen"), new Schaltung("Kettenschaltung"), new Reifen("Standardreifen"));

            Bike emtb = new Bike("Schwarzes E-Mountainbike", new Rahmen("Aluminum", "Schwarz"),
                    new Bremsen("Scheibenbremsen"), new Schaltung("Kettenschaltung"), new Reifen("Mountainbike-Reifen"));

            Bike estadtfahrrad = new Bike("Weißes E-Stadtfahrrad", new Rahmen("Aluminum", "Weiß"),
                    new Bremsen("Trommelbremsen"), new Schaltung("Nabenschaltung"), new Reifen("Stadtfahrrad-Reifen"));

            // Ausgabe der Fahrradbeschreibungen
            rennrad.printBikeDetails();
            System.out.println("\n------------------------\n");
            emtb.printBikeDetails();
            System.out.println("\n------------------------\n");
            estadtfahrrad.printBikeDetails();
        }

    }
