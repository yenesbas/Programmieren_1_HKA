public class ArrayStackTest {
    public static void main(String[] args) {
        testIntegerStack();
        testStringStack();
    }

    private static void testIntegerStack() {
        System.out.println("Testing Integer Stack:");
        Stack<Integer> intStack = new ArrayStack<>();

        for (int i = 1; i <= 5; i++) {
            intStack.push(i);
            System.out.println("Zahl " + intStack.top() + " wurde eingefuegt." + "(Elementenanzahl: " + intStack.size() + ")");
        }
        System.out.println("Stapel Elementenanzahl: " + intStack.size());
        System.out.println("Oberste Element (top): " + intStack.top());

        while (!intStack.isEmpty()) {
            System.out.print(intStack.pop() + " wurde entfernt (pop) ");
            System.out.println("Aktuelle oberste Element (top): " + intStack.top());
        }
        System.out.println("Es gibt " + intStack.size() + " Elements in Stapel");
    }

    private static void testStringStack() {
        String space = "-";
        System.out.println(space);
        System.out.println("Testing String Stack:");
        Stack<String> stringStack = new ArrayStack<>();
        stringStack.push("Hallo");
        stringStack.push("Guten");
        stringStack.push("Tag");
        stringStack.push("Java");
        stringStack.push("Karlsruhe");


        System.out.println("Stapel Elementenanzahl: " + stringStack.size());

        System.out.println("Oberste Element (top): " + stringStack.top());

        while (!stringStack.isEmpty()) {
            System.out.print(stringStack.pop() + " wurde entfernt (pop) ");
            System.out.println("Aktuelle oberste Element (top): " + stringStack.top());
        }
        System.out.println("Es gibt " + stringStack.size() + " Elements in Stapel");
    }
}
