import java.util.Iterator;
import java.util.LinkedList;


class Stack<T> implements Iterable<T> {

    LinkedList<T> list = new LinkedList<T>();

    public void push(T element)
    {
        list.addFirst(element);
    }

    // Entfernt und gibt das oberste Element des Stacks zurück
    public T pop() {


        return list.removeFirst();
    }

    // Gibt das oberste Element des Stacks zurück, ohne es zu entfernen
    public T peek() {

        return list.getFirst();
    }

    // Überprüft, ob der Stack leer ist
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    // Implementierung des Iterable-Interface
    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    // Beispiel für die Verwendung in einer for-each-Schleife
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);



        System.out.println("size of the stack is: " +  stack.size());

        // Verwendung der for-each-Schleife
        for (int element : stack) {
            System.out.println(element);
        }
    }
}
