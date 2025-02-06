package org.example;
import com.github.lalyos.jfiglet.FigletFont;

public class Main {
    public static void main(String[] args) {

        System.out.print("Hello and welcome!");
        System.out.print("2nd output here");

        String asciiArt = FigletFont.convertOneLine("alte fische!");
        System.out.println(asciiArt);


    }
}