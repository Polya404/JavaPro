package lesson13;

public class Pair {
    private String in;

    public Pair(String in) {
        this.in = in;
    }


    @Override
    public String toString() {
        return "Pair{\"" + in + "\" : \"" +
                in.toUpperCase() + '\"' +
                '}';
    }
}
