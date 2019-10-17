import java.util.*;

public class TextManipulation {
    //    Create a program where you should have a huge text (hardcoded in a variable)
//    and it should prompt in console the number of sentences and words of this text.
//
//    You should have, at least ,one class for main function
//    and another class for text manipulation info.
//
//    Show in the console the number of letters, vowels and consonants from that text.
//    Implement also to show the most often words in the text (top 5)
//    and the longest one.
    public String text;

    public TextManipulation(String text) {
        this.text = text;
    }

    public static int sentencesCounter(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '.' || c == '!' || c == '?')
                count++;
        }
        return count;
    }

    public static int wordsCounter(String text) {
        int words = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) == ' ') && (text.charAt(i + 1) != ' '))
                words++;
        }

        if (text.charAt(0) != ' ') {
            words = words + 1;
        }
        return words;
    }

    public static int letterCounter(String text) {
        int letters = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) >= (char) 97 && (text.charAt(i) <= (char) 122)) ||
                    (text.charAt(i) >= (char) 65 && (text.charAt(i) <= (char) 90)))
                letters++;
        }
        return letters;
    }

    public static int[] VowsCons(String text) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) >= (char) 97 && (text.charAt(i) <= (char) 122)) ||
                    (text.charAt(i) >= (char) 65 && (text.charAt(i) <= (char) 90))) {
                if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' ||
                        text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'y') {
                    vowels++;
                } else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static String longestWord(String text) {
        String[] word = text.split("\\W+");
        String longest = word[0];
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > longest.length())
                longest = word[i];
        }
        return longest;
    }

    public static void topWords(String text) {
        String mostFrequent = null;
        String[] string = text.split("\\W+");
        List<String> words = new ArrayList<>(Arrays.asList(string));
        System.out.println("Top 5 most used words in given text: ");
        for (int k = 0; k < 5; k++) {
            int maxCount = 0;
            for (int i = 0; i < words.size(); i++) {
                int count = 1;
                for (int j = i + 1; j < words.size(); j++) {
                    if (words.get(i).equals(words.get(j))) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    mostFrequent = words.get(i);
                }
            }
            for (int i = 0; i < words.size(); i++) {
                words.remove(mostFrequent);}
            System.out.println(mostFrequent + " (" + maxCount + " times)");
        }
    }
}
