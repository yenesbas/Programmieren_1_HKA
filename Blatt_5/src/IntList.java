class IntList {

    public class Iterator {
        private ListCell cursor;

        private Iterator(ListCell start) {
            cursor = start;
        }

        public boolean hasNext() {
            return (cursor != null);
        }
        public int next() {
            int currentContent = cursor.content;
            cursor = cursor.next;
            return currentContent;
        }
    }

    public Iterator iterator() {
        return new Iterator(head);
    }


    private class ListCell {
        int content;
        ListCell next;

        ListCell(int x, ListCell n) {
            this.content = x;
            this.next = n;
        }
    }

    public ListCell head;

    public IntList() {
        head = null;
    }

    public void addFirst(int x) {
        ListCell newHead = new ListCell(x, head);
        head = newHead;
    }

    public Integer getFirst()
    {
        if (head == null)
        {
            return null;
        }
        return head.content;
    }

    public boolean dropFirst() {
        if (head == null) {
            return false;
        } else {
            head = head.next;
            return true;
        }
    }

    public void addLast(int x) {
        if (head == null) {
            head = new ListCell(x, null);
        } else {
            ListCell c = head;
            while (c.next != null) {
                c = c.next;
            }
            c.next = new ListCell(x, null);
        }
    }

    public Integer getLast() {
        if (head == null) {
            return null;
        } else {
            ListCell c = head;
            while (c.next != null) {
                c = c.next;
            }
            return c.content;
        }
    }

    public boolean dropLast() {
        ListCell c = head;
        ListCell k = null;
        if (head == null) {
            return false;
        } else if (c.next == null) {
            head = null;
            return true;
        } else {
            while (c.next != null) {
                k = c;
                c = c.next;
            }
            k.next = null;
            return true;
        }
    }

    public void remove(int x) {
        ListCell c = head;

        while ( c  != null && c.content == x){


            head = c = c.next;

        }
        if (c == null){
            return;
        }

        while (c.next != null) {




            if (c.next.content == x) {
                c.next = c.next.next;

            }
            else {

                c = c.next;
            }
        }


    }

    public boolean contains(int x) {
        boolean wahrheit = false;
        ListCell c = head;
        while (c != null) {
            if (c.content == x) {
                wahrheit = true;
            }
            c = c.next;
        }
        return wahrheit;
    }

    public int size() {
        int i = 0;
        ListCell c = head;
        while (c != null) {
            c = c.next;
            i++;
        }
        return i;
    }

    boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        int count = 0;
        ListCell c = head;
        StringBuilder ausgabe = new StringBuilder("[");
        while (c != null) {
            ausgabe.append(c.content);
            c = c.next;
            count++;
            if(c != null)
            {
                ausgabe.append(", ");
            }
        }
        ausgabe.append("]");
        return ausgabe.toString();
    }

    public void reverse() {
        ListCell alt = null;
        ListCell aktuell = head;
        ListCell naechste = null;
        while (aktuell != null) {
            naechste = aktuell.next;
            aktuell.next = alt;
            alt = aktuell;
            aktuell = naechste;
        }
        head = alt;
    }
}