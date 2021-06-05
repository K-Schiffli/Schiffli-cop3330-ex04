/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String noun = getNoun();
        String verb = getVerb();
        String adjective = getAdjective();
        String adverb = getAdverb();
        printStory(noun, verb, adjective, adverb);
    }
    public static String getNoun()
    {
        System.out.println( "Enter a noun:" );
        return in.nextLine();
    }

    public static String getVerb()
    {
        System.out.println( "Enter a verb:" );
        return in.nextLine();
    }

    public static String getAdjective()
    {
        System.out.println( "Enter an adjective:" );
        return in.nextLine();
    }

    public static String getAdverb()
    {
        System.out.println( "Enter an adverb:" );
        return in.nextLine();
    }

    public static void printStory(String noun, String verb, String adjective, String adverb)
    {
        System.out.printf( "Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}