// Component class
class Komponente {
    private String name;

    public Komponente(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Frame class
class Rahmen extends Komponente {
    private String color;


    public Rahmen(String material, String color) {
        super(material);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " Rahmen" + '\n'+
                " - Color = '" + color + '\'';

    }
}

// Brake class
class Bremsen extends Komponente {
    private String name1;
    public Bremsen(String type) {
        super(type);
        name1 = type;
    }

    public String toString() {
        return name1;
    }
}

// Gear class
class Schaltung extends Komponente {
    private String name1;
    public Schaltung(String type) {
        super(type);
        name1 = type;
    }
    public String toString() {
        return name1;
    }
}

// Tire class
class Reifen extends Komponente {
    private String name1;
    public Reifen(String name) {
        super(name);
        name1 = name;
    }
    public String toString() {
        return name1;
    }
}

// Bike class
public class Bike {
    private String name;
    private Rahmen rahmen;
    private Bremsen bremsen;
    private Schaltung schaltung;
    private Reifen reifen;

    public Bike(String name, Rahmen rahmen, Bremsen bremsen, Schaltung schaltung, Reifen reifen) {
        this.name = name;
        this.rahmen = rahmen;
        this.bremsen = bremsen;
        this.schaltung = schaltung;
        this.reifen = reifen;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public Rahmen getRahmen() {
        return this.rahmen;
    }

    public void setRahmen(Rahmen rahmen) {
        this.rahmen = rahmen;
    }

    public Bremsen getBremsen() {
        return bremsen;
    }

    public void setBremsen(Bremsen bremsen) {
        this.bremsen = bremsen;
    }

    public Reifen getReifen() {
        return reifen;
    }

    public Schaltung getSchaltung() {
        return schaltung;
    }

    public void setSchaltung(Schaltung schaltung) {
        this.schaltung = schaltung;
    }

    public void setReifen(Reifen reifen) {
        this.reifen = reifen;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", Rahmen" + rahmen +
                ", Bremsen=" + bremsen +
                ", Schaltung=" + schaltung +
                ", Reifen=" + reifen;

    }

    public void printBikeDetails() {
        System.out.println("Bike Name: " + name);
        System.out.println("Komponente:");
        System.out.println(" - Rahmen: " + rahmen);
        System.out.println(" - Bremsen: " + bremsen);
        System.out.println(" - Schaltung: " + schaltung);
        System.out.println(" - Reifen: " + reifen);
    }
}

// RoadBike class
class Rennrad extends Bike {
    public Rennrad(String name, Rahmen rahmen, Bremsen bremsen, Schaltung schaltung, Reifen reifen) {
        super(name, rahmen, bremsen, schaltung, reifen);
    }
    public String toString() {
        return "Bike{" +
                "name='" + super.getName() + '\'' +
                ", Rahmen" + super.getRahmen() +
                ", Bremsen=" + super.getBremsen() +
                ", Schaltung=" + super.getSchaltung() +
                ", Reifen=" + super.getReifen();

    }
}

// MTB class
class MTB extends Bike {
    public MTB(String name, Rahmen rahmen, Bremsen bremsen, Schaltung schaltung, Reifen reifen) {
        super(name,rahmen , bremsen, schaltung, reifen);
    }
    public String toString() {
        return "Bike{" +
                "name='" + super.getName() + '\'' +
                ", Rahmen" + super.getRahmen() +
                ", Bremsen=" + super.getBremsen() +
                ", Schaltung=" + super.getSchaltung() +
                ", Reifen=" + super.getReifen();

    }
}

// CityBike class
class Stadtrad extends Bike {
    public Stadtrad(String name, Rahmen rahmen, Bremsen bremsen, Schaltung schaltung, Reifen reifen) {
        super(name, rahmen, bremsen, schaltung, reifen);
    }
    public String toString() {
        return "Bike{" +
                "name='" + super.getName() + '\'' +
                ", Rahmen" + super.getRahmen() +
                ", Bremsen=" + super.getBremsen() +
                ", Schaltung=" + super.getSchaltung() +
                ", Reifen=" + super.getReifen();

    }
}

// EMTB class
class EMTB extends MTB {
    public EMTB(String name, Rahmen rahmen, Bremsen bremsen, Schaltung schaltung, Reifen reifen) {
        super(name,rahmen, bremsen, schaltung, reifen);
    }
    public String toString() {
        return "Bike{" +
                "name='" + super.getName() + '\'' +
                ", Rahmen" + super.getRahmen() +
                ", Bremsen=" + super.getBremsen() +
                ", Schaltung=" + super.getSchaltung() +
                ", Reifen=" + super.getReifen();

    }
}

// ECityBike class
class ECityBike extends Stadtrad {
    public ECityBike(String name, Rahmen rahmen, Bremsen bremsen,Schaltung schaltung, Reifen reifen) {
        super(name,rahmen, bremsen, schaltung, reifen);
    }
    public String toString() {
        return "Bike{" +
                "name='" + super.getName() + '\'' +
                ", Rahmen" + super.getRahmen() +
                ", Bremsen=" + super.getBremsen() +
                ", Schaltung=" + super.getSchaltung() +
                ", Reifen=" + super.getReifen();
    }
}
