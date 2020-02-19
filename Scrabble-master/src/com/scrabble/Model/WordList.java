package com.scrabble.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordList {

    final private ArrayList<String> wordList;

    //upon creation, the wordlist populates from packaged text file wordlist.dat
    public WordList() throws FileNotFoundException {
        try (Scanner fileScanner = new Scanner(new File(getClass().getResource("wordlist.dat").getFile()))) {
            wordList = new ArrayList<>();
            while (fileScanner.hasNext()) {
                wordList.add(fileScanner.next());
            }//end while
        }
    }//end constructor

    //return true of word is in the wordlist
    public boolean challenge(String word) {
        return wordList.stream().anyMatch((currentWord) -> (word.equalsIgnoreCase(currentWord)));
    }//end Challenge

    //return size of wordlist
    public int size() {
        return wordList.size();
    }//end size()

    //get word at index
    public String get(int index) {
        return wordList.get(index);
    }//end get()

}//end WordList
