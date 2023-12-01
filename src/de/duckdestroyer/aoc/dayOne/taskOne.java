package de.duckdestroyer.aoc.dayOne;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class taskOne {

    public static void importTxt() {

        ArrayList<String> input = new ArrayList<>();
        try {
            File file = new File("src/de/duckdestroyer/aoc/dayOne/input.txt");
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
        int ges = 0;
        for(int i = 0; i < numbers.size(); i++) {
            ges = ges + numbers.get(i);
        }
        System.out.println(ges);
    }

}
