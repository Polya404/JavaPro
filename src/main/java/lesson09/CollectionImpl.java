package lesson09;

public class CollectionImpl implements CustomCollection {
    private Node first;
    private Node last;
    private int size = 0;

    private static class Node {
        String element;
        Node next;
        Node previous;

        public Node(String element) {
            this.element = element;
        }
    }

    @Override
    public boolean add(String str) {
        Node newNode = new Node(str);
        if (first == null) {
            newNode.next = null;
            newNode.previous = null;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAll(CollectionImpl strColl) {
        if (strColl == null || strColl.size() == 0) {
            return false;
        }
        for (int i = 0; i < strColl.size; i++) {
            add(strColl.get(i));
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (first == null) {
            return false;
        }
        if (index < 0 || index > size()) {
            return false;
        }
        Node p = first, p1 = null;
        int i = -1;
        while (p != null) {
            i++;
            if (i == index) {
                if (p1 == null) {
                    first = first.next;
                } else {
                    p1.next = p.next;
                }
            }
            p1 = p;
            p = p.next;
        }
        size--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        Node current = first;
        Node previous = first;
        while (!(current.element.equals(str))) {
            if (current.next == null)
                return false;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else {
            previous.next = current.next;
        }
        size--;
        return true;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.element;
    }

    @Override
    public boolean contains(String str) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        first = null;
        last = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return true;
    }

}
