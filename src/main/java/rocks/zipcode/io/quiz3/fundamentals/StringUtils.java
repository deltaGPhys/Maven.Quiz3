package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0,indexToCapitalize) + str.substring(indexToCapitalize,indexToCapitalize+1).toUpperCase() + str.substring(indexToCapitalize+1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (baseString.charAt(indexOfString) == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        HashSet<String> output = new HashSet<>();
        String[] array = string.split("");
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                output.add(string.substring(i,j));
            }
        }
        return output.toArray(new String[output.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return StringUtils.getAllSubStrings(input).length;
    }
}
