package org.example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Test

        Scanner scn = new Scanner(System.in);

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        System.out.println("Enter Some words to begin");

        String input = scn.next();

        String[] words = input.split("\\s+"); //Splits the words Where the is whitespace

        for(String word : words) {
            if(wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        for(String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(word + "(" + count);
        }


    }
}