package _practice_programs;
// import java.awt.*;
import hsa_ufa.Console;
/*
Class Name: Main
Programmer: Ayush
Date Modified: Thursday, September 2022
Description: Class for all the submissions of Module 2.1 Text Output
*/
public class Main {
    static Console c;
    public static void main(String[] args) {
        nameArt(c); //executing a method
    }

    public static void textOutput(Console c) {
        c = new Console(); // Creates new Console
        c.println("A slash is \"/\"\nwhile\na backslash is \"\\\"");
    }

    public static void nameArt(Console c) {
        c = new Console(); // Creates new Console
        c.println("     A\n    A A\n   AAAAA\n  A     A\n A       A");
        c.println("\nY         Y\n Y       Y\n  Y     Y\n   Y  Y\n    Y\n    Y\n    Y");
        c.println("\nU     U\nU     U\nU     U\nU     U\nUUUUUUU");
        c.println("\nSSSSSSSSS\nS\nS\nS\nS\nSSSSSSSSS\n        S\n        S\n        S\n        S\nSSSSSSSSS");
    }

    public static void wordArt(Console c) {
        c = new Console(); // Creates new Console
        c.println("PARALLELOG\n A        R\n  R        A\n   ALLELOGRAM");
        c.println("\n  APEZO\n R     I\nTRAPEZOID");
        c.println("\n   D\n  I I\n A   A\nM     M\n O   O\n  N N\n   D");
    }

    public static void receipt(Console c) {
        c = new Console(); // Creates new Console
        c.println("         PETE'S CLOTHIER\n         ***************\n\n           Date:   November 5\n           Name:   Jane Doe\n           Phone #:   555-9990\n       QTY     ITEM        $PRICE$\n\n       1       pants       $4.25\n       2       t-shirt     $4.00\n               TOTAL:      $12.25");
    }

    public static void extraProblem(Console c) {
        c = new Console(); // Creates new Console
        int variable = 2 + 2;
        c.println(variable + " is 4!");
    }
    
}
