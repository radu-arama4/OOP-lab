package com.radu.oop_lab.lab3;

public class Main {
    public static void main(String[] args) {
        //New instance of type Text
        Text txt = new Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " +
                "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        //Task 1
        System.out.println("Nr. of sentences - " + txt.nrOfSentences());
        System.out.println("Nr. of words - " + txt.nrOfWords());

        //Task 2
        System.out.println("Nr. of vowels - " + txt.nrOfVowels());
        System.out.println("Nr. of consonants - " + txt.nrOfConsonants());
        System.out.println("Nr. if letters - " + txt.nrOfLetters());

        //Task 3
        System.out.println("\nTOP 5:");
        txt.topFiveWords();
        System.out.println("\nLongest word: " + txt.getLongest());
    }
}
