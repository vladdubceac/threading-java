package md.vladdubceac.learning.lambda;

public class ConcatenateTraditional implements ConcatenateInterface {
    public static void main(String[] args) {
        ConcatenateTraditional concatenateTraditional = new ConcatenateTraditional();
        System.out.println(concatenateTraditional.sconcat("Hello", "World"));
    }

    @Override
    public String sconcat(String a, String b) {
        return a + " " + b;
    }
}
