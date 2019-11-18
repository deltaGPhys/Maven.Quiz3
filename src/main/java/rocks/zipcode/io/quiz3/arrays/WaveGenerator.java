package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String base = str.toLowerCase();
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (base.charAt(i) >= 96 && base.charAt(i) <= 122) {
                output.add(StringUtils.capitalizeNthCharacter(base,i));
            }
        }
        return output.toArray(new String[output.size()]);
    }
}
