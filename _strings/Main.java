package _strings;
import hsa_ufa.*;

public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        // executing all of the methods
        L3Q1_ASMa_d(c);
        L3Q1_ASMe(c);
        L3Q1_ASMf(c);
        L3Q2_ASM2(c);
        L3Q3_ASM3(c);
        L3Q4_MirrorMirror(c);
        L3Q5_StudentComplaining(c);
    }
    /**
     * Method for the answer of Question 1 a - d
     * @param c
     */
    public static void L3Q1_ASMa_d(Console c) {
        // Input
        c.println("Please enter a random word");
        String input = c.readLine();

        // Processing / Output
        c.println("The word capitalized is " + input.toUpperCase()); // capitalizes input
        c.println("The word all lowercase is " + input.toLowerCase()); // lowercases input
        c.println("The word with all of it's \"a\" replaced with \"e\" is " + input.replace('a', 'e')); // Replaces a with e
        c.println("Please enter a word");
        String word = c.readLine();
        if(input.contains(word)) {
            c.println("The index of the word " + word + " in your input is " + input.indexOf(word));
        } else {
            c.println("The word " + word + " does not exist in your input");
        }
    } // end of L3Q1_ASMa_d method
    /**
     * Method for the answer of Question 1 e
     * @param c
     */
    public static void L3Q1_ASMe(Console c) {
        // Input
        c.println("Please input a word");
        String input = c.readLine();

        // Processing / Output
        c.println("Your input has " + input.length() + " words in it"); // Prints the length of the input
    } // end of L3Q1_ASMe method
    /**
     * Method for the answer of Question 1 f
     * @param c
     */
    public static void L3Q1_ASMf(Console c) {
        // Input
        c.println("Please input a word");
        String input = c.readLine();
        
        // Processing / Output
        c.println("Your input has " + input.split(".").length + " sentences in it"); // Prints the sentences
    } // end of L3Q1_ASMf method
    /**
     * Method for answer of Question 2
     * @param c
     */
    public static void L3Q2_ASM2(Console c) {
        // Input
        c.println("Please input a sentence");
        String sentence = c.readLine();        

        // Processing / Output
        int i = 0;
        while (i < sentence.length()) {
            c.print(sentence.split("")[i]);
            i += 2;
        }
    } // end of L3Q2_ASM2 method
    /**
     * Method for answer of Bonus Question 3
     * @param c
     */
    public static void L3Q3_ASM3(Console c) {
        // Input
        c.println("Please input a sentence");
        String sentence = c.readLine();        
        c.println("Please input the number of characters in the sentence to print");
        int i = c.readInt();

        // Processing / Output
        if(i > sentence.length()) return;
        for (int x = 0; x < sentence.length(); x += i) { // n is the number we ask the user to input
            c.print(sentence.split("")[x]);
        }
    } // end of L3Q3_ASM3 method 
    /**
     * Method for answer of Question 4
     * @param c
     */
    public static void L3Q4_MirrorMirror(Console c) {
        // Input
        c.println("Please input a sentence");
        String sentence = c.readLine();

        // Processing / Output
        for (int x = sentence.length() - 1; x > -1; x--) {
            c.print(sentence.split("")[x]);
        }
    } // end of L3Q4_MirrorMirror method
    /**
     * Method for answer of Question 5
     * @param c
     */
    public static void L3Q5_StudentComplaining(Console c) {
        // for loop for replacing the vowels with blanks in the sentence
        for (;;) {
            // Input
            c.println("Please input a word");
            String sentence = c.readLine();

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
} // end of main