package de.duckdestroyer.aoc.dayOne;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class taskTwo {

    public static void taskTwo() {

        ArrayList<String> input = new ArrayList<>();
        try {
            File file = new File("src/de/duckdestroyer/aoc/dayOne/inputTwo.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                input.add(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        String number = "";
        for(int i = 0; i < input.size(); i++) {
            if(input.get(i).contains("one")) {
                input.set(i, input.get(i).replace("one", "o1e"));
            }
            if(input.get(i).contains("two")) {
                input.set(i, input.get(i).replace("two", "t2o"));
            }
            if(input.get(i).contains("three")) {
                input.set(i, input.get(i).replace("three", "th3ee"));
            }
            if(input.get(i).contains("four")) {
                input.set(i, input.get(i).replace("four", "fo4ur"));
            }
            if(input.get(i).contains("five")) {
                input.set(i, input.get(i).replace("five", "fi5ve"));
            }
            if(input.get(i).contains("six")) {
                input.set(i, input.get(i).replace("six", "s6x"));
            }
            if(input.get(i).contains("seven")) {
                input.set(i, input.get(i).replace("seven", "se7en"));
            }
            if(input.get(i).contains("eight")) {
                input.set(i, input.get(i).replace("eight", "ei8ht"));
            }
            if(input.get(i).contains("nine")) {
                input.set(i, input.get(i).replace("nine", "ni9ne"));
            }
            for(int j = 0; j < input.get(i).length(); j++) {
                if(Character.isDigit(input.get(i).charAt(j))) {
                    number = number + input.get(i).charAt(j);
                }
            }
            if(number.length() > 2) {
                number = number.substring(0, 1) + number.substring(number.length() - 1);
            }
            if(number.length() == 1) {
                number = number + number;
            }
            numbers.add(Integer.parseInt(number));
            number = "";
        }
        float ges = 0;
        for(int i = 0; i < numbers.size(); i++) {
            ges = ges + numbers.get(i);
        }
        System.out.println(ges);
    }


}
