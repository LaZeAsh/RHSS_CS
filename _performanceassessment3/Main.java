/*
Programmer: Ayush
Date Modified: Monday, November 28, 2022
Class Name: Main
Description: Class for the solution of Programming Assignment
*/
package _performanceassessment3;
import hsa_ufa.*;
import java.io.*;

public class Main {
  static hsa_ufa.Console c; // The output console
  
  public static void main (String[] args) {
    c = new hsa_ufa.Console();
    // executing the program
    fileString(c);  
  } // end of main method
  /**
   * Solution for the programming assignment
   * @param c
   */
  public static void fileString(hsa_ufa.Console c) {
    String VOWELS = "aeiouAEIOU";     //string of all vowels   
    // try catch statement to catch errors in case no file
    try {
        // variable declarations
        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        PrintWriter output = new PrintWriter(new PrintStream("Note.txt"));
        String finalString = "";
        int vowelsReplaced = 1;
        String vowels = "";
        
        //INPUT
        String line = input.readLine();
        // while loop to iterate through the input file until there is no more lines in the file
        while(line != null) {
            c.println("INPUT: " + line);
            // for loop to loop through the sentence and encrypt everything
            for(int x = 0; x < line.length(); x++) {
                // gets the character at a certain index in the string
                char lineChar = line.charAt(x);
                // checks if the character is a vowel
                if(VOWELS.contains(Character.toString(lineChar))) {
                  // concatenation to strings
                  finalString = finalString.concat(Integer.toString(vowelsReplaced));
                  vowels = vowels.concat(Character.toString(lineChar));
                  // increasing number because the vowel has been found
                  vowelsReplaced++;
                } else {
                  // concatenating the character to the string in case it's not a vowel
                  finalString = finalString.concat(Character.toString(lineChar));
                }
            } // end of for loop
            
            // OUTPUT
            // Writes to the console and file in appropriate format
            c.println(finalString);
            c.println(vowels.toUpperCase());
            c.println(" ");
            output.write(finalString + "\n");
            output.write(vowels.toUpperCase() + "\n");
            output.write("\n");
            // Resetting values for all of the variables so they can be used in next iteration of loop
            vowelsReplaced = 1;
            vowels = "";
            finalString = "";
            // reading next line of loop
            line = input.readLine();
        } // end of while loop
        // closing input and output
        input.close();
        output.close();
    } catch(IOException e) {
        // dealing with the error
        System.out.println(e);
    } // end of try-catch statement
  } // end of fileString method
} // end of Main class