package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
        System.out.println(args[0]);
        System.out.println("Hello World");

    }

    public int blackJack(int hand1, int hand2) {
        if ((hand1 >21 | hand1 <=0) & (hand2 >21 | hand2 <=0)) {
            return 0;
        }
        else if (hand1 > 21 | hand1 <= 0) {
            return hand2;
        }
        else if (hand2 > 21 | hand2 <= 0) {
            return hand1;
        }
        else if (hand1 > hand2) {
            return hand1;
        }
        else {
            return hand2;
        }
    }

}

