public class Main {

    public static void main(String[] args) {

        String myText = "His father peeled off his gloves and handed them to Jory Cassel, " +
                "the captain of his household guard. " +
                "He took hold of Ice with both hands and said, " +
                "In the name of Robert of the House Baratheon, " +
                "the First of his Name, King of the Andals and the Rhoynar " +
                "and the First Men, Lord of the Seven Kingdoms and Protector of " +
                "the Realm, by the word of Eddard of the House Stark, " +
                "Lord of Winterfell and Warden of the North, I do sentence you to die. " +
                "He lifted the greatsword high above his head.";

        System.out.println("The text has " + TextManipulation.sentencesCounter(myText) + " sentences.");
        System.out.println("The text has " + TextManipulation.wordsCounter(myText) + " words.");
        System.out.println("The text has " + TextManipulation.letterCounter(myText) + " letters.");

        int[] printVowsCons = TextManipulation.VowsCons(myText);
        System.out.println("The text has " + printVowsCons[0] + " vowels and " + printVowsCons[1] + " consonants.");

        System.out.println("The longest word is " + TextManipulation.longestWord(myText));
        TextManipulation.topWords(myText);

    }

}
