package hw14_java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsThreads {
    public static Optional<String> getMax(List<String> words) {
        return words.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .max(Comparator.comparingInt(word -> word.replaceAll("[^a-z]", "").length()));
    }

    public static Map<String, Integer> getWords(Stream<String> words) {
        return words.collect(Collectors.toMap(word -> word, word -> 1, (a, b) -> a + b));
    }
}
