enum Suit {
    //pik, herz, karo, kreuz
    spades, hearts, diamonds, clubs;
    static Suit fromInt(int suitNr) {
        return switch (suitNr) {
            case 1 -> Suit.spades;
            case 2 -> Suit.hearts;
            case 3 -> Suit.diamonds;
            case 4 -> Suit.clubs;
            default -> null;
        };
    }
}

enum Rank {
    //ass, bube, dame, könig, 2-10 Zahlen
    ace, jack, queen, king, two, three, four, five, six, seven, eight, nine, ten;
    static Rank fromInt(int rankNr) {
        return switch (rankNr) {
            case 1 -> Rank.ace;
            case 2 -> Rank.jack;
            case 3 -> Rank.queen;
            case 4 -> Rank.king;
            case 5 -> Rank.two;
            case 6 -> Rank.three;
            case 7 -> Rank.four;
            case 8 -> Rank.five;
            case 9 -> Rank.six;
            case 10 -> Rank.seven;
            case 11 -> Rank.eight;
            case 12 -> Rank.nine;
            case 13 -> Rank.ten;
            default -> null;
        };
    }
}
public class CardGame {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Card randomCard = Card.random();
            System.out.println("Zufällige Karte " + (i + 1) + ": " + randomCard.name());
        }
    }
}
