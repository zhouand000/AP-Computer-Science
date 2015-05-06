package examples.ap.wordscrambler;

@SuppressWarnings("javadoc")
public class WordScrambler {

    public static void main (String[] args) {

	System.out.println(recombine("1234", "4321"));
	String[] array = {"1234", "4321", "alphadelta", "type1ninja"};
	System.out.println(java.util.Arrays.toString(mixedWords(array)));

    }
    public static String recombine (String word1, String word2) {

	return word1.substring(0,word1.length()/2).concat(word2.substring(word2.length()/2,word2.length()));

    }

    private static String[] mixedWords (String[] words) {

	for (int i = 0; i < words.length; i+=2) {

	    String temp = words[i];
	    words[i] = recombine(words[i], words[i+1]);
	    words[i+1] = recombine(words[i+1], temp);

	}

	return words;

    }

}