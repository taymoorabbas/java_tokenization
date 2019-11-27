/*
Created by: Taymoor Ghazanfar
R.no: 3625-BSSE-F17-C
Date: 27-Nov-19
Time: 9:19 PM
Lau ji Ghauri aya fir
*/

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        //default delimiter is \s
        StringTokenizer st1 = new StringTokenizer("hello! my name is Taymoor");
        while (st1.hasMoreTokens()){

            System.out.println(st1.nextToken());
        }

        //here we have a custom delimiter '.'
        StringTokenizer st2 = new StringTokenizer("Hey yo!. I am gonna beat the shit out of you." +
                "no one is better than me when you talk about wrestling." +
                "there is only one razor ramon. Chiko!", ".");
        while (st2.hasMoreTokens()){

            System.out.println(st2.nextToken());
        }

        //this constructor also shows the delimiter ie. '!'
        StringTokenizer st3 = new StringTokenizer("Nigga! Come at me bruh! if you are man enough!"
                , "!"
                , true);
        while (st3.hasMoreElements()){

            System.out.println(st3.nextToken());
        }

        //using the split method on a string array (this is the easiest)
        String[] st4 = "Demonstrating a simple string splitting".split("\\s");
        for (String s : st4){

            System.out.println(s);
        }
    }
}
