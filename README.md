# Programmieren 1 - HKA

Dieses Repository enthält meine Lösungen für die Laborübungen im Fach **Programmieren 1** an der **Hochschule Karlsruhe (HKA)**.

## 📚 Überblick

Die Aufgaben sind in verschiedenen Übungsblättern (Blatt 1-8) organisiert und decken grundlegende Programmierkonzepte in Java ab.

## 📂 Struktur

Das Repository ist nach Übungsblättern strukturiert:

```
Programmieren_1_HKA/
├── Blatt_1/    # Einführung in Java (Hello World, Ausgaben)
├── Blatt_2/    # Grundlegende Programmierkonzepte
├── Blatt_3/    # Schleifen und Berechnungen (Quersumme, Heron-Verfahren, Kartenspiel)
├── Blatt_4/    # Objektorientierung (Komplexe Zahlen, TicTacToe)
├── Blatt_5/    # Datenstrukturen (Listen)
├── Blatt_6/    # Klassen und Objekte
├── Blatt_7/    # Erweiterte Datenstrukturen (Stack)
└── Blatt_8/    # Weitere Übungen
```

Jedes Übungsblatt enthält mehrere Aufgaben, die in separaten Unterordnern organisiert sind (z.B. `Aufgabe_1`, `Aufgabe_2`, etc.).

## 🔧 Verwendung

Die meisten Aufgaben sind eigenständige Java-Programme, die kompiliert und ausgeführt werden können:

```bash
# Beispiel für Aufgabe 1 aus Blatt 1
cd Blatt_1/Aufgabe_1
javac HalloWelt.java
java HalloWelt
```

## 📖 Themen

Die Übungen behandeln unter anderem:

- **Grundlagen**: Ein-/Ausgabe, Variablen, Datentypen
- **Kontrollstrukturen**: Schleifen, Verzweigungen
- **Objektorientierung**: Klassen, Objekte, Methoden
- **Datenstrukturen**: Listen, Stacks
- **Algorithmen**: Heron-Verfahren, Quersumme
- **Anwendungen**: Kartenspiele, TicTacToe, komplexe Zahlen

## 🗂️ Detaillierte Themenübersicht

### **Blatt 1 - Grundlagen**

#### [Aufgabe 1](Blatt_1/Aufgabe_1/) - Erstes Programm
- Grundlagen: Erstes Java-Programm, `main`-Methode
- Variablen (String)
- Ausgabe mit `System.out.println()`
- **Dateien**: [HalloWelt.java](Blatt_1/Aufgabe_1/HalloWelt.java), [Gedicht.java](Blatt_1/Aufgabe_1/Gedicht.java)

#### [Aufgabe 2](Blatt_1/Aufgabe_2/) - Klassen definieren
- **Klassen & Konstruktoren** (Kreis, GleichSeitigesDreieck, Quadrat, Rechteck)
- **Primitive Datentypen** (int, boolean)
- **Referenztypen** (String)
- **Datei**: [DrBob.java](Blatt_1/Aufgabe_2/DrBob.java)

#### [Aufgabe 3](Blatt_1/Aufgabe_3/) - Objektbeziehungen
- **Klassen** (mehrere Klassen)
- **Referenztypen** und Objektbeziehungen
- **Datei**: [Friendbook.java](Blatt_1/Aufgabe_3/Friendbook.java)

---

### **Blatt 2 - Berechnungen und Methoden**

#### [Aufgabe 4](Blatt_2/Aufgabe_4/) - Halloumi-Grill
- **Variablen** (static)
- **Primitive Datentypen** (double, int)
- **Arithmetische Operatoren**
- **Methoden** (Aufbau, Parameter, Rückgabewerte)
- **if-Kontrollstrukturen**
- Scanner für Eingabe
- **Dateien**: [Aufgabe_a.java](Blatt_2/Aufgabe_4/Aufgabe_a.java), [Aufgabe_b.java](Blatt_2/Aufgabe_4/Aufgabe_b.java)

#### [Aufgabe 5](Blatt_2/Aufgabe_5/) - Bremsweg
- **Variablen** und **Datentypen**
- **Arithmetische Operatoren** (Math.pow)
- Type Casting
- **Dateien**: [Aufgabe_5a.java](Blatt_2/Aufgabe_5/Aufgabe_5a.java), [Aufgabe_5b.java](Blatt_2/Aufgabe_5/Aufgabe_5b.java)

---

### **Blatt 3 - Schleifen und Algorithmen**

#### [Aufgabe 1](Blatt_3/Aufgabe_1/) - Quersumme
- **while-Schleifen**
- **Methoden** (quersumme, quersummeHex)
- **if-else** Kontrollstrukturen
- **Arithmetische Operatoren** (%, /)
- Hexadezimale Zahlen
- **Datei**: [Quersumme.java](Blatt_3/Aufgabe_1/Quersumme.java)

#### [Aufgabe 2](Blatt_3/Aufgabe_2/) - Formatierung
- **Methoden** (intFormatDemo, doubleFormatDemo)
- **for-Schleifen**
- **Arithmetische Operatoren**
- String-Formatierung
- **if-Kontrollstrukturen**
- **Datei**: [FormatDemo.java](Blatt_3/Aufgabe_2/FormatDemo.java)

#### [Aufgabe 3](Blatt_3/Aufgabe_3/) - Heron-Verfahren
- **for-Schleife** (Heron10)
- **do-while-Schleife** (HeronFixpoint)
- **Methoden**
- **Arithmetische Operatoren**
- **Logische Operatoren** (Vergleich)
- **Dateien**: [Heron10.java](Blatt_3/Aufgabe_3/Heron10.java), [HeronFixpoint.java](Blatt_3/Aufgabe_3/HeronFixpoint.java)

#### [Aufgabe 4](Blatt_3/Aufgabe_4/src/) - Kartenspiel
- **switch-Kontrollstruktur** (moderne switch-expression)
- **Klassen & Konstruktoren**
- **Methoden** (name, random)
- **Enums** (Suit, Rank)
- **for-Schleife**
- **Dateien**: [Card.java](Blatt_3/Aufgabe_4/src/Card.java), [CardGame.java](Blatt_3/Aufgabe_4/src/CardGame.java)

---

### **Blatt 4 - Objektorientierung**

#### [Aufgabe 1](Blatt_4/Aufgabe_1/) - Komplexe Zahlen
- **Klassen & Konstruktoren** (mit Überladen)
- **Methodenüberladen** (zwei Konstruktoren)
- **private Attribute**
- **Arithmetische Operatoren**
- **Methoden** (add, sub, mul, div, toString, equals)
- **Primitive Datentypen** (double)
- **Dateien**: [Complex.java](Blatt_4/Aufgabe_1/Complex.java), [ComplexTest.java](Blatt_4/Aufgabe_1/ComplexTest.java)

#### [Aufgabe 2](Blatt_4/Aufgabe_2/) - TicTacToe
- **2D-Arrays** (char[][])
- **Klassen & Konstruktoren**
- **for-Schleifen** (verschachtelt)
- **while-Schleife**
- **if-else** Kontrollstrukturen
- **Logische Operatoren** (&&, ||)
- **Methoden** (private/public)
- **Datei**: [TicTacToe.java](Blatt_4/Aufgabe_2/TicTacToe.java)

---

### **Blatt 5 - Datenstrukturen: Listen**

#### [Aufgabe: IntList](Blatt_5/src/)
- **Datenstrukturen: Einfach verkettete Listen**
- **Klassen** (innere Klassen: ListCell, Iterator)
- **Konstruktoren**
- **Methoden** (addFirst, addLast, remove, contains, reverse, etc.)
- **while-Schleifen**
- **if-else** Kontrollstrukturen
- **Logische Operatoren**
- Iterator-Pattern
- **Dateien**: [IntList.java](Blatt_5/src/IntList.java), [IntListApp.java](Blatt_5/src/IntListApp.java)

---

### **Blatt 6 - Vererbung und Polymorphie**

#### [Aufgabe 1](Blatt_6/Aufgabe_1/) - Bike-Hierarchie
- **Vererbung** (Rennrad, MTB, Stadtrad, EMTB extends)
- **Klassen & Konstruktoren**
- **Polymorphie** (toString überschreiben)
- **Methodenüberschreiben** (toString)
- Getter/Setter-Methoden
- Komposition (Bike hat Komponenten)
- **Dateien**: [Bike.java](Blatt_6/Aufgabe_1/Bike.java), [Main.java](Blatt_6/Aufgabe_1/Main.java)

#### [Aufgabe 2](Blatt_6/Aufgabe_2/) - Integer-Methoden & BigInteger
- **Methoden**
- **if-else**
- **Rekursion** (berechneFakultaet)
- **Primitive Datentypen**
- BigInteger/BigDecimal
- Wrapper-Klassen (Integer)
- **Datei**: [Aufgabe_2.java](Blatt_6/Aufgabe_2/Aufgabe_2.java)

---

### **Blatt 7 - Interfaces und Stack**

#### [Aufgabe 2](Blatt_7/Aufgabe_2/) - Stack Interface
- **Interface** (Stack<E>)
- Generics
- **Datei**: [blatt7_2.java](Blatt_7/Aufgabe_2/blatt7_2.java)

#### [Aufgabe 3](Blatt_7/Aufgabe%203/) - ArrayStack
- **Interface** (Stack<E>)
- **Klassen** (ArrayStack implements Stack)
- **Polymorphie** (Interface-Implementierung)
- **1D-Arrays** (Object[])
- **Methoden** (Überschreiben von Interface-Methoden)
- **if-else** Kontrollstrukturen
- **while-Schleife**
- Generics (<E>)
- **Dateien**: [Stack.java](Blatt_7/Aufgabe%203/Stack.java), [ArrayStack.java](Blatt_7/Aufgabe%203/ArrayStack.java), [ArrayStackTest.java](Blatt_7/Aufgabe%203/ArrayStackTest.java)

#### [Aufgabe 4](Blatt_7/Aufgabe_4/) - Stack mit LinkedList
- **Interface** (Stack<E>, Iterable<T>)
- **Klassen**
- LinkedList (Java-API)
- Iterator-Pattern
- **for-each-Schleife**
- Generics
- **Datei**: [Stack.java](Blatt_7/Aufgabe_4/Stack.java)

---

## 📊 Themen-Mapping

| **Thema** | **Blätter & Aufgaben** |
|-----------|------------------------|
| **Primitive Datentypen** | [Blatt 1/2](#blatt-1---grundlagen), [Blatt 2/4-5](#blatt-2---berechnungen-und-methoden), [Blatt 4/1](#aufgabe-1-blatt_4aufgabe_1---komplexe-zahlen), [Blatt 6/2](#aufgabe-2-blatt_6aufgabe_2---integer-methoden--biginteger) |
| **Referenztypen** | Blatt 1-7 (durchgängig) |
| **Variablen & Operatoren** | [Blatt 2/4-5](#blatt-2---berechnungen-und-methoden), [Blatt 3](#blatt-3---schleifen-und-algorithmen), [Blatt 4](#blatt-4---objektorientierung) |
| **if/if-else** | [Blatt 2/4](#aufgabe-4-blatt_2aufgabe_4---halloumi-grill), [Blatt 3](#blatt-3---schleifen-und-algorithmen), [Blatt 4](#blatt-4---objektorientierung), [Blatt 5](#blatt-5---datenstrukturen-listen), [Blatt 6/2](#aufgabe-2-blatt_6aufgabe_2---integer-methoden--biginteger), [Blatt 7/3](#aufgabe-3-blatt_7aufgabe-3---arraystack) |
| **switch** | [Blatt 3/4](#aufgabe-4-blatt_3aufgabe_4src---kartenspiel) |
| **for-Schleife** | [Blatt 3/2,3,4](#blatt-3---schleifen-und-algorithmen), [Blatt 4/2](#aufgabe-2-blatt_4aufgabe_2---tictactoe), [Blatt 7/4](#aufgabe-4-blatt_7aufgabe_4---stack-mit-linkedlist) |
| **while-Schleife** | [Blatt 3/1,3](#blatt-3---schleifen-und-algorithmen), [Blatt 4/2](#aufgabe-2-blatt_4aufgabe_2---tictactoe), [Blatt 5](#blatt-5---datenstrukturen-listen), [Blatt 7/3](#aufgabe-3-blatt_7aufgabe-3---arraystack) |
| **do-while-Schleife** | [Blatt 3/3](#aufgabe-3-blatt_3aufgabe_3---heron-verfahren) (HeronFixpoint) |
| **1D-Arrays** | [Blatt 7/3](#aufgabe-3-blatt_7aufgabe-3---arraystack) (ArrayStack) |
| **2D-Arrays** | [Blatt 4/2](#aufgabe-2-blatt_4aufgabe_2---tictactoe) (TicTacToe) |
| **Methoden (Aufbau)** | Blatt 2-7 (durchgängig) |
| **Methodenüberladen** | [Blatt 4/1](#aufgabe-1-blatt_4aufgabe_1---komplexe-zahlen) (Complex Konstruktoren) |
| **Methodenüberschreiben** | [Blatt 6/1](#aufgabe-1-blatt_6aufgabe_1---bike-hierarchie), [Blatt 7/3](#aufgabe-3-blatt_7aufgabe-3---arraystack) |
| **Rekursion** | [Blatt 6/2](#aufgabe-2-blatt_6aufgabe_2---integer-methoden--biginteger) (berechneFakultaet) |
| **Klassen & Konstruktoren** | Blatt 1-7 (durchgängig) |
| **Vererbung** | [Blatt 6/1](#aufgabe-1-blatt_6aufgabe_1---bike-hierarchie) (Bike-Hierarchie) |
| **Polymorphie** | [Blatt 6/1](#aufgabe-1-blatt_6aufgabe_1---bike-hierarchie), [Blatt 7](#blatt-7---interfaces-und-stack) |
| **Abstrakte Klassen** | - (nicht behandelt) |
| **Interfaces** | [Blatt 7](#blatt-7---interfaces-und-stack) (Stack, Iterable) |
| **Einfach verkettete Listen** | [Blatt 5](#blatt-5---datenstrukturen-listen) (IntList) |
| **Doppelt verkettete Listen** | - (nicht behandelt) |

## 📝 Hinweise

- Die Lösungen sind für Lernzwecke erstellt
- Jede Aufgabe ist in ihrem eigenen Verzeichnis organisiert
- Einige Aufgaben enthalten Testklassen zur Überprüfung der Funktionalität

## 🎓 Hochschule

**Hochschule Karlsruhe - Technik und Wirtschaft**  
Fach: Programmieren 1

---

*Dieses Repository dient zu Dokumentations- und Lernzwecken.*
