public class Vowel {
    private static final String INSETWORD = "mommy";
    private static final double RATE = 0.3;


    public String mommifier(String word) {
        int insertIndex = indexOfContinuousVowel(word);

        if (word == null) {
            throw new NullPointerException();
        }

        if (isRateUnder30Percent(word) || insertIndex == -1) {
            return word;
        }

        StringBuilder wordBuilder = new StringBuilder(word);
        StringBuilder result = wordBuilder.insert(insertIndex, INSETWORD);
        return mommifier(result.toString());
    }


    private Boolean isRateUnder30Percent(String word) {
        double count = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (isVowels(letter)) {
                count++;
            }
        }
        return count / word.length() < RATE;
    }

    private Integer indexOfContinuousVowel(String word) {
        int index = -1;
        for (int i = 1; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (isVowels(letter)) {
                if (letter == word.charAt(i - 1)) {
                    index = i;
                }
            }
        }
        return index;
    }

    private Boolean isVowels(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
    }


}
