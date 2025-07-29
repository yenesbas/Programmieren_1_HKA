/**
 *
 * @param <E> typ der Elemente, die auf dem Stapel gespeichert werden.
 */
public interface Stack<E> {
    /**
     * Legt ein neues Element auf den Stapel.
     *
     * @param element Das Element, das auf den Stapel gelegt werden soll.
     */
    void push(E element);

    /**
     * Entfernt das oberste Element vom Stapel und gibt es zurück.
     *
     * @return Das entfernte Element.
     * @throws EmptyStackException Wenn versucht wird, von einem leeren Stapel zu poppen.
     */
    E pop();

    /**
     * Gibt den Wert des obersten Elements zurück, ohne es zu entfernen.
     *
     * @return Der Wert des obersten Elements.
     * @throws EmptyStackException Wenn versucht wird, das oberste Element von einem leeren Stapel zu lesen.
     */
    E top();

    /**
     * Überprüft, ob der Stapel leer ist.
     *
     * @return true, wenn der Stapel leer ist, sonst false.
     */
    boolean isEmpty();

    /**
     * Gibt die Anzahl der Elemente auf dem Stapel zurück.
     *
     * @return Die Anzahl der Elemente auf dem Stapel.
     */
    int size();
}