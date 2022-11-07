package _strings;
import java.util.ArrayList;

import hsa_ufa.*;

public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        L3Q3_ASM2(c);
    }

    public static void L3Q1_ASMa_c(Console c) {
        c.println("Please enter a random word");
        String input = c.readLine();
        c.println("The word capitalized is " + input.toUpperCase());
        c.println("The word all lowercase is " + input.toLowerCase());
        c.println("The word with all of it's \"a\" replaced with \"e\" is " + input.replace('a', 'e'));
        c.println("Please enter a word");
        String word = c.readLine();
        if(input.contains(word)) {
            c.println("The index of the word " + word + " in your input is " + input.indexOf(word));
        } else {
            c.println("The word " + word + " does not exist in your input");
        }
    }

    public static void L3Q1_ASMe(Console c) {
        c.println("Please input a word");
        String input = c.readLine();
        c.println("Your input has " + input.length() + " words in it");
    }

    public static void L3Q1_ASMf(Console c) {
        c.println("Please input a word");
        String input = c.readLine();
        c.println("Your input has " + input.split(".").length + " sentences in it");
    }

    public static void L3Q2_ASM(Console c) {
        c.println("Please input a sentence");
        String sentence = c.readLine();        
        int i = 0;
        while (i < sentence.length()) {
            c.print(sentence.split("")[i]);
            i += 2;
        }
    }

    public static void L3Q3_ASM2(Console c) {
        c.println("Please input a sentence");
        String sentence = c.readLine();        
        c.println("Please input the number of characters in the sentence to print");
        int i = c.readInt();
        if(i > sentence.length()) return;
        for (int x = 0; x < sentence.length(); x += i) {
            c.print(sentence.split("")[x]);
        }
    }

    public static void L3Q4_MirrorMirror(Console c) {
        c.println("Please input a sentence");
        String sentence = c.readLine();
        for (int x = sentence.length() - 1; x > -1; x--) {
            c.print(sentence.split("")[x]);
        }
    }

    public static void L3Q5_StudentComplaining(Console c) {
        for (;;) {
            c.println("Please input a word");
            String sentence = c.readLine();
            if(sentence == "*") break;
            sentence = sentence.replace("a", "");    
            sentence = sentence.replace("e", "");    
            sentence = sentence.replace("i", "");    
            sentence = sentence.replace("o", "");    
            sentence = sentence.replace("u", "");    
            c.println(sentence);
        }
    }


} // end of main