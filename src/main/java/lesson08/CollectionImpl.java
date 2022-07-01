package lesson08;

import lesson10.Iterator;

public class CollectionImpl implements Collection {
    private String[] array = new String[10];
    private int size = 0;
    private int currentIndex = 0;

    @Override
    public boolean add(String value) {
        if (size == array.length) {
            grow();
        }
        array[size++] = value;
        return true;
    }

    @Override
    public boolean add(int index, String value) {
        if (size == array.length) {
            grow();
        }
        if (index > size) {
            return false;
        }
        String[] result = new String[array.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }

        result[index] = value;

        for (int i = index + 1; i <= array.length; i++) {
            result[i] = array[i - 1];
        }
        this.array = result;
        size++;

        return true;
    }

    @Override
    public boolean delete(String value) {
        String elementToBeDeleted = value;
        int foundIndex = 0;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] == elementToBeDeleted || array[i].equals(elementToBeDeleted)) {
                array[i] = null;
                foundIndex = i;
            }
        }
        for (int j = foundIndex + 1; j < size; j++) {
            array[j - 1] = array[j];
            array[j] = null;
        }

        size--;
        return true;
    }

    @Override
    public String get(int index) {
        if (index > size | index < 0) {
            return "Индекс вышел за предел значений";
        }
        return array[index];
    }

    @Override
    public boolean contain(String value) {
        for (int i = 0; i < size; i++) {
            if (value == null & array[i] == null) {
                return true;
            }
            if (value == null | array[i] == null) {
                continue;
            }
            if (value.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        for (int i = 0; i < str.size(); i++) {
            for (int j = 0; j < str.size(); j++) {
                if (!(str.get(i).contains(array[j]))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean clear() {
        array = new String[10];
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    private boolean grow() {
        String[] array = new String[(int) (this.array.length * 1.5)];
        for (int i = 0; i < this.array.length; i++) {
            array[i] = this.array[i];
        }
        this.array = array;
        return true;
    }


    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {


            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public String next() {
                return array[currentIndex++];
            }

            @Override
            public void remove() {
                final String[] newArray = new String[array.length - 1];
                int indexToRemove = currentIndex + 1;

                System.arraycopy(array, 0, newArray, 0, indexToRemove);
                System.arraycopy(array, indexToRemove + 1, newArray, indexToRemove, newArray.length - indexToRemove);

                array = newArray;
            }

            @Override
            public void forEach(CollectionImpl collection) {
                while (collection.iterator().hasNext()) {
                    System.out.println(iterator().next());
                }
            }


        };
        return it;
    }
}




