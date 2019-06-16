package hw12_io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class LetterCounter {
    private static String PATH = "C:\\Users\\Alexandr\\IdeaProjects\\HW\\src\\hw12_io";

    public static Map<Character, Integer> readAndWrite() throws IOException {
        Map<Character, Integer> letters = new TreeMap<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(PATH + "\\in"))){
            String text;
            while ((text = reader.readLine()) != null) {
                for (char letter : text.replaceAll("\\s+", " ").toLowerCase().toCharArray()) {
                    if (letters.get(letter) == null) {
                        letters.put(letter, 1);
                    } else {
                        letters.put(letter, letters.get(letter) + 1);
                    }
                }

                text.toCharArray();
            }
        }

        try (BufferedWriter out = new BufferedWriter(new FileWriter(PATH + "\\countLetters.txt"))){
            for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
                out.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
        }
        return letters;
    }
}

