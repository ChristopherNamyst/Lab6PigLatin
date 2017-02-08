package bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Greet and welcome user..
        System.out.println("Welcome to Chris' Pig Latin Translator! ");

        String answer = "";
        //the loop to keep translating if the user enters "yes"
        do {
            System.out.print("Enter a word for translation: ");
            String word = scan.next().toLowerCase();

            //translate the word
            String translated = translate(word);

            // output the word
            System.out.println(translated);

            // ask user if they would like to continue
            System.out.print("Would you like to continue? yes/no ");

            //get the response, turn it into lower case
            answer = scan.next().toLowerCase();

        } while (answer.equals("yes"));

    }

    public static String translate(String word) {

        //find the first vowel
        int vowel = findVowel(word);

        // if invalid then print:
        if (vowel == -1) {
            return "invalid:" + word;
        }
        //if at position 0
        if (vowel == 0) {
            System.out.println(word + "way");

        } else {
            word = word.substring(vowel, word.length()) + word.substring(0, vowel) + "ay";
        }

        return word;
    }

    // method to FIND VOWEL, THANKS JAMES!!!
    public static int findVowel(String word) {

            // begin loop and compute
        for (int i = 0; i < word.length(); i++) {

            // use charAt() to get the letter
            char d  = word.charAt(i);

            // if it's 'a' or 'e' or 'i' or 'o' or 'u' then return i
            if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {

                return i;

            }
        }
        return -1;

    }
}
