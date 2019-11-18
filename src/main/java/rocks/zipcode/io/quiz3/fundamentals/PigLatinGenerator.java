package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split(" ");
        String[] output = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            output[i] = translateWord(words[i]);
        }

        return String.join(" ",output);
    }

    public String translateWord(String str) {
        if (VowelUtils.startsWithVowel(str)) {
            return str+"way";
        } else {
            int firstV = VowelUtils.getIndexOfFirstVowel(str);
            if (firstV != -1) {
                return str.substring(firstV) + str.substring(0, firstV) + "ay";
            } else {
                return str+"ay";
            }
        }
    }
}
