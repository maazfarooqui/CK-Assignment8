import java.util.function.BiFunction;

public class LambdaExp {

    public static void main(String args[])
    {
        BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;

        System.out.println(mul.apply(7,2));
        System.out.println((add.apply(19,10)));
        System.out.println(sub.apply(21,11));
    }
}
