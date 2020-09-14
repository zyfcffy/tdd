public class Vowel {


    public String mommifier(String word) throws Exception {
        if(word==null){
            throw new Exception();
        }

        if(isRateUnder30Percent(word)){
            return word;
        }

        return null;
    }

    private Boolean isRateUnder30Percent(String word){
        double count = 0;
        for(int i = 0;i<word.length();i++){
            char letter = word.charAt(i);
            if(isVowels(letter)){
                count++;
            }
        }
        return count/word.length()<0.3;
    }

    private Boolean isVowels(char letter){
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'||
                letter == 'A'|| letter == 'E'|| letter == 'I'|| letter == 'O'|| letter == 'U';
    }
}
