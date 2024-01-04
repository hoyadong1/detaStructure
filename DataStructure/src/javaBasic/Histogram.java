package javaBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        String text = "Your English text goes here.\n" + "This is another line of text.";

        text = text.toUpperCase();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            frequencyMap.put(c, 0);
        }

        try (Scanner scanner = new Scanner(text)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    char currentChar = line.charAt(i);
                    if (Character.isLetter(currentChar)) {
                        frequencyMap.put(currentChar, frequencyMap.get(currentChar) + 1);
                    }
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.print(entry.getKey());
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
