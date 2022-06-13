package lesson07;

import java.util.Arrays;

public class StringCollection implements StringArray {
    private String[] array = new String[10];
    private int size = 0;

    public boolean add(int index, String value) {
        if (size == array.length) {
            grow();
        }
        if (value != null) {
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
        }
        return true;
    }

    public boolean add(String value) {
        if (size == array.length) {
            grow();
        }
        if (value != null) {
            array[size] = value;
            size++;
        }
        return true;
    }

    public boolean delete(int index) {
        String[] newArr = null;
        String elementToBeDeleted = array[index];

        for (int i = 0; i < array.length-1; i++) {
            if(array[i].equals(elementToBeDeleted)){
                newArr = new String[array.length - 1];
                for(int n = 0; n < i; n++){
                    newArr[n] = array[n];
                }
                for(int j = i; j < array.length - 1; j++){
                    newArr[j] = array[j+1];
                }
                break;
            }
        }
        this.array = newArr;
        size--;
        return true;
    }

    public boolean delete(String value) {
        String[] newArr = null;
        String elementToBeDeleted = value;

        for (int i = 0; i < array.length-1; i++) {
            if(array[i].equals(elementToBeDeleted)){
                newArr = new String[array.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = array[index];
                }
                for(int j = i; j < array.length - 1; j++){
                    newArr[j] = array[j+1];
                }
                break;
            }
        }
        this.array = newArr;
        size--;
        return true;
    }

    public String get(int index) {
        return array[index];
    }

    private String[] grow() {
        String[] array = new String[(int) (this.array.length * 1.5)];
        for (int i = 0; i < this.array.length; i++) {
            array[i] = this.array[i];
        }
        this.array = array;
        return this.array;
    }

    public void printArray(){
        System.out.print("Array { ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
    }
}
