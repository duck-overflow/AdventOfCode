package de.duckdestroyer.aoc.main;

import de.duckdestroyer.aoc.dayOne.taskOne;
import de.duckdestroyer.aoc.dayOne.taskTwo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        taskOne tO = new taskOne();
        taskTwo tT = new taskTwo();
        tO.importTxt();
        tT.taskTwo();

    }
}