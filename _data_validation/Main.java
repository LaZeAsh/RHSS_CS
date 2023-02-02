/*
Class Name: Main
Programmer: Ayush
Date Modified: Monday, December 5 
Description: Class for the submission of 3.7 action problems
*/
package _data_validation;
import java.io.IOException;
import java.io.*;

import hsa_ufa.*;
import hsa_ufa.Console;

public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        L7Q1_StudentComplaningV2(c);
        L7Q2_MarksCalculator(c);
        L5Q4_VocabularyTester(c);
    }
    /**
     * 
     * @param c
     */
    public static void L7Q1_StudentComplaningV2(Console c) {
        for (;;) {
            // Input
            c.println("Please input a word (less than or equal to 6 words)");
            String sentence = c.readLine();
            if(sentence.split(" ").length > 6) continue;
            // Processing / Output
            if(sentence == "*") break;
            sentence = sentence.replace("a", "");    
            sentence = sentence.replace("e", "");    
            sentence = sentence.replace("i", "");    
            sentence = sentence.replace("o", "");    
            sentence = sentence.replace("u", "");    
            c.println(sentence);
        }
    } // end of L3Q5_StudentComplaining method
    /**
     * 
     * @param c
     */
    public static void L7Q2_MarksCalculator(Console c) {
        int highestMark = 0;
        int secondHighestMark = 0;
        double average = 0;
        try {
           for(int x = 0; x < 5; x++) {
                c.println("Input a mark (int)");
                String line = c.readLine();
                int mark = Integer.parseInt(line);
                if(mark < highestMark && mark > secondHighestMark) {
                    secondHighestMark = mark;
                }
                average += mark;
            } 
            c.println("Second highest mark " + secondHighestMark);
            c.println("Average mark " + (average / 5));
        } catch (Error e) {
            c.println("Not an int try again plz");    
        }
    }
    public static void L5Q4_VocabularyTester(Console c) {
        // try catch statement to catch errors
        try {
            BufferedReader input;
            input = new BufferedReader(new FileReader("NurseryRhyme.txt"));
            PrintWriter output;
            output = new PrintWriter(new PrintStream("output.txt")); 
            // for loop to output the number of letters / words per sentence
            for (;;) {
                String line = input.readLine();
                // to prevent nonexistent data from being read
                if(line == null) {
                    break;
                }
                if(line.length() < 3) {
                    continue;
                }
                // puncutation list ! . ?
                // filtering out punctuation
                if(line.contains(".")) line.replace('.', ' '); 
                if(line.contains("!")) line.replace('!', ' '); 
                if(line.contains("?")) line.replace('?', ' ');

                String[] arr = line.split(" ");
                int average = 0;
                // for loop to iterate through array
                for (int x = 0; x < arr.length; x++) {
                average += arr[x].length();
                } // end of for loop
                // finding average
                average = (int) average / arr.length;
                output.write(Integer.toString(average) + "\n");
                average = 0;
            }
            // close input and output files
            input.close();
            output.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}