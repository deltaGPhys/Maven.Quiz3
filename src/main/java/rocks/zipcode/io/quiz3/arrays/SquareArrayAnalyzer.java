package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        if (inputArray.length != squaredValues.length) {
            return false;
        }
        ArrayList squaredVals = new ArrayList<Integer>(Arrays.asList(squaredValues));
        Long squareCount = Arrays.stream(inputArray).filter( x -> squaredVals.contains(x*x)).count();
        if (squareCount == squaredValues.length){
            return true;
        }
        return false;
    }
}
