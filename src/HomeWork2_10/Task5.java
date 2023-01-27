package HomeWork2_10;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task5 {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<Integer> condition,
            Function<Integer, Integer> ifTrue,
            Function<Integer, Integer> ifFalse) {
        return t -> (U) (condition.test((Integer) t) ? ifTrue.apply((Integer) t) : ifFalse.apply((Integer) t));
    }

}
