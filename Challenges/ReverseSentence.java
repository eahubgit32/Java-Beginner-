package Challenges;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ReverseSentence{

    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);

        System.out.println ("Enter a word to be reverse");
        String sentence = scanner.nextLine();

        String[] word = sentence.split("\\s+");
        List<String> wordList = Arrays.asList(word);
        Collections.reverse(wordList);

        String reversedSentence = String.join(" ", wordList);

        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reversedSentence);

    }
}