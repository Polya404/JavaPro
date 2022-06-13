package lesson08;

public class CollectionImpl implements Collection {
    private String[] array = new String[10];
    private int size = 0;

    @Override
    public boolean add(String value) {
        if (size == array.length) {
            grow();
        }
        array[size] = value;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, String value) {
        if (size == array.length) {
            grow();
        }
        if (index > size + 1) {
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
        String[] newArr = null;
        String elementToBeDeleted = value;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(elementToBeDeleted)) {
                newArr = new String[array.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = array[index];
                }
                for (int j = i; j < array.length - 1; j++) {
                    newArr[j] = array[j + 1];
                }
                break;
            }
        }
        this.array = newArr;
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
                if (str.get(i).contains(array[j])) {
                } else {
                    return false;
                }
            }
        }
        return false;
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

    private String[] grow() {
        String[] array = new String[(int) (this.array.length * 1.5)];
        for (int i = 0; i < this.array.length; i++) {
            array[i] = this.array[i];
        }
        this.array = array;
        return this.array;
    }

}




