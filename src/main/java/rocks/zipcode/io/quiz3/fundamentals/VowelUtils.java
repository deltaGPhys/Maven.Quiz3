package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (String letter : word.split("")) {
            if (VowelUtils.isVowel(letter.charAt(0))) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String[] letters = word.split("");
        for (int i = 0; i < letters.length; i++) {
            if (VowelUtils.isVowel(letters[i].charAt(0))){
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if (VowelUtils.isVowel(word.charAt(0))){
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        return character.toString().matches("^[aAeEiIoOuU]$");
    }
}
