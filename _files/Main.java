/*
Class Name: Main
Programmer: Ayush
Date Modified: Wednesday, November 16
Description: Class for the submission of 3.5 action problems
*/
package _files;
import hsa_ufa.*;
import hsa_ufa.Console;
import java.io.*;

public class Main {
    static hsa_ufa.Console c;
    public static void main(String[] args) throws IOException {
        c = new hsa_ufa.Console();
        // L5Q2_CapitalizeThis(c);
        L5Q4_VocabularyTester(c);
    } // end of main method
    /**
     * Solution for Question 1 in 3.5 action
     * @param c
     */
    public static void L5Q1_ReadToMe(hsa_ufa.Console c) {
        try {
            // initializing the input and output 
            BufferedReader input;
            input = new BufferedReader(new FileReader ("NurseryRhyme.txt"));
            PrintWriter output;
            output = new PrintWriter(new PrintStream("output.txt"));
            
            // Processing / Output
            // for loop to read input and write lines to the file
            for (;;) {
                String line = input.readLine(); // reads the line
                if(line != null) {
                    c.println(line); // prints line to verify it's being read
                    output.write(line + "\n"); // writes to the file 
                } else {
                    break;
                }
            } // end of for loop 
            // closing the input and output
            input.close();
            output.close();
        } catch (IOException e) { // catching errors
            System.out.println(e); // prints error to the console
        }
    }// end of L5Q1_ReadToMe
    /**
     * Solution for Question 2 3.5 action
     * @param c
     */
    public static void L5Q2_CapitalizeThis(Console c) {
        // try statement to catch any errors
        try {
            // input and output
            BufferedReader input;
            input = new BufferedReader(new FileReader("NurseryRhyme.txt"));
            PrintWriter output;
            output = new PrintWriter(new PrintStream("output.txt")); 
            
            // Processing / Output
            // for loop to get 5 sentences
            for (int x = 0; x < 5; x++) {
                String line = input.readLine();
                // if statement to prevent errors
                if(line == null) {
                    continue;
                }
                // 2nd for loop to iterate through each sentence
                for (int y = 0; y < line.length(); y++) {
                    if(line.charAt(y) == ' ') {
                        // writes to file
                        output.write(' ');
                        continue;
                    }
                    if(Character.isUpperCase(line.charAt(y))) {
                        // writes to file
                        output.write(Character.toLowerCase(line.charAt(y)));
                    } else {
                        // writes to file
                        output.write(Character.toUpperCase(line.charAt(y)));
                    }
                    if(y == line.length() - 1) {
                        output.write("\n");
                    }
                }
            } // end for loop
            // closing the input and output
            input.close();
            output.close();
            
        } catch (IOException e) { // catches file errors
            System.out.println(e);
        }
    } // end of L5Q2_CapitalizeThis method
    /**
     * Solution for Question 3 3.5 action  
     * @param c
     */
    public static void L5Q3_StudentMarks(Console c) {
        try {
            PrintWriter output;
            output = new PrintWriter(new PrintStream("output.txt")); // makes space for the output 

            // Processing / Output
            // for loop to generate 100 marks and write them in the output file
            for (int x = 0; x < 100; x++) {
                int randomMark =(int) Math.round((Math.random() + 40) * 100) - 40;
                output.write(randomMark);    
            } // end of for loop
            // closing the file
            output.close();
        } catch (IOException e) {
            // catching errors and printing them if necessary
            System.out.println(e);
        }       
    } // end of L5Q3_StudentMarks method

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
} // end of Main class

