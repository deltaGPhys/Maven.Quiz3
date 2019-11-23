package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        return Arrays.stream(array).filter( x -> getNumberOfOccurrences(x)%2 == 1).findFirst().get();
    }

    public SomeType findEvenOccurringValue() {
        return Arrays.stream(array).filter( x -> getNumberOfOccurrences(x)%2 == 0).findFirst().get();
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return (int) Arrays.stream(array).filter( x -> x.equals(valueToEvaluate)).count();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
//        Object[] results = Arrays.stream(array).filter(predicate::apply).toArray();
//        SomeType[] target = Arrays.copyOf(array, results.length);
//        for (int i = 0; i < results.length; i++) {
//            target[i] = (SomeType) results[i];
//        }
//        return target;

//        ArrayList<SomeType> target = new ArrayList<SomeType>();
//        Arrays.stream(array).filter(predicate::apply).forEach(x -> target.add(x));
//        return target.toArray(Arrays.copyOf(array, 0));

        return Arrays.stream(array).filter(predicate::apply).collect(toList()).toArray(Arrays.copyOf(array, 0));

    }
}
