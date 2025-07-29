import java.util.Random;

public class Card {

    Suit suit;
    Rank rank;
    public Card() {};
    public Card (Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    String name() {
        String germanCard="";
        switch (suit) {
            case spades -> germanCard="Pik";
            case hearts -> germanCard="Herz";
            case diamonds -> germanCard="Karo";
            case clubs -> germanCard="Kreuz";

        };
        switch (rank) {
            case ace -> germanCard+=" Ass";
            case jack -> germanCard+=" Bube";
            case queen -> germanCard+=" Dame";
            case king -> germanCard+=" König";
            case two -> germanCard+=" Zwei";
            case three -> germanCard+=" Drei";
            case four -> germanCard+=" Vier";
            case five -> germanCard+=" Fünf";
            case six -> germanCard+=" Sechs";
            case seven -> germanCard+=" Sieben";
            case eight -> germanCard+=" Acht";
            case nine -> germanCard+=" Neun";
            case ten -> germanCard+=" Zehn";


        }
        return germanCard;
    }



    static Card random() {
        Random randomGenerator = new Random();
        Suit randomSuit = Suit.fromInt(randomGenerator.nextInt(1,4));
        Rank randomRank = Rank.fromInt(randomGenerator.nextInt(1,13));
        return new Card(randomSuit, randomRank);

    }
}
