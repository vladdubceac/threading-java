package md.vladdubceac.learning.lambda;

interface IncrementByNInterface {
    int increment(int a);
}

public class IncrementByFiveTraditional {
    public static void main(String[] args) {
        int a = 2;
        IncrementByNInterface incrementBy5 = x -> x + 5;
        int b = incrementBy5.increment(a);
        System.out.println(a);
        System.out.println(b);
    }
}