package _files_strings_review;
/*
Class Name: Main
Programmer: Ayush
Date Modified: Wednesday, November 18
Description: Class for the submission of review problems
*/
import java.io.*;
import hsa_ufa.*;
import hsa_ufa.Console;
public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        encryption(c);
    }
    /**
     * method for review problem solution
     * @param c
     */
    public static void encryption(Console c) {
        // try statement to catch any errors while making a new file
        try {
            // opening input and output files
            BufferedReader input = new BufferedReader(new FileReader("NurseryRhyme.txt"));
            PrintWriter output = new PrintWriter(new PrintStream("output.txt"));
            // getting input
            String line = input.readLine();
            // defining variables needed for the program
            String vowels = "";
            String newSentence = "";
            String VOWELS = "aeiouAEIOU";
            // for loop to iterate until no more sentences in the file
            
            // Processing
            for (;;) {
                // if line is no more then break
                if(line == null) {
                    break;
                }
                // for loop to iterate through the sentence and replace vowels with astericks
                for (int x = 0; x < line.length(); x++) {
                    char sentenceChar = line.charAt(x);
                    // if the list of VOWELS have the character then the character is a vowel
                    if(VOWELS.contains(Character.toString(sentenceChar))) {
                        // following the rule
                        newSentence += "*";
                        vowels += sentenceChar;
                        continue;
                    }
                    // following the rule
                    if(sentenceChar == ' ') {
                        newSentence += "+";
                        continue;
                    }
                    newSentence += sentenceChar;
                } // end of for loop

                // Output
                output.write(newSentence + "\n");
                output.write(vowels + "\n");
                c.println(newSentence);
                c.println(vowels);
                c.println(" ");
                line = input.readLine();
            } // end of for loop
            // closing input and output files
            input.close();
            output.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    } // end of encryption method
} // end of class Main