import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {

    private Object[] arrays;
    private int position; // size
    private int speicherPlatz; // capacity

    public ArrayStack() {
        arrays = new Object[1];
        speicherPlatz = 1;
        position = 0;
    }

    @Override
    public void push(E element) {
        if(position == speicherPlatz){
            verdoppeln();
        }
        arrays[position++] = element;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            System.out.println("Stapel ist leer");
            return null;
        } else {
            E element = getElementAtTop();
            position = position - 1;
            halbieren();
            return element;
        }
    }

    @Override
    public E top() {
        if (isEmpty()) {
            System.out.println("Stapel ist leer.");
            return null;
        } else {
            return getElementAtTop();
        }
    }

    @Override
    public boolean isEmpty() {
        if(position == 0){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public int size() {
        return position;
    }

    private void verdoppeln() {
            int doppeltPlatz = speicherPlatz * 2;
            arrays = Arrays.copyOf(arrays, doppeltPlatz);
            speicherPlatz = doppeltPlatz;
    }

    private void halbieren() {
        if (position < 0.4 * speicherPlatz && speicherPlatz > 1) {
            int halftePlatz = Math.max(1, (speicherPlatz / 2));
                arrays = Arrays.copyOf(arrays, halftePlatz);
            speicherPlatz = halftePlatz;
        }
    }

    @SuppressWarnings("unchecked")
    private E getElementAtTop() {
        return (E) arrays[position - 1];
    }
}
