class Friendbook{
    String eigentuemer;
    5 freieEintraege;
}

class FriendbookEntry{
    Author a1, a2, a3, a4, a5;
    String freiText1, freiText2, freiText3, freiText4, freiText5;
}

class Author{
    String name;
    Birthday datum;
    String geschlecht;
    AuthorPreferences vorlieben;
}

class AuthorPreferences{
    String farbe;
    String tierArt;
    String buch;
    String film;
    String musikStueck;
}

class Birthday{
    int jahr;
    int monat;
    int tag;
}