package lesson07;

public interface StringArray {
    public boolean add(int index, String value);

    public boolean add(String value);

    public boolean delete(int index);

    public boolean delete(String value);

    public String get(int index);
}
