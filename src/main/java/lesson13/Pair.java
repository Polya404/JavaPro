package lesson13;

public class Pair {
    private String in;
    private String out;

    public Pair(String in) {
        this.in = in;
        this.out = in.toUpperCase();
    }

    @Override
    public String toString() {
        return "Pair{\"" + in + "\" : \"" +
                 out + '\"' +
                '}';
    }
}
