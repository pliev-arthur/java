package ru.pliev.labs.lab5.voicelessConsonants;

import java.io.*;
import java.util.*;

public class VCAnalyzer {
    private static final Set<Character> VOICELESS_CONSONANTS = Set.of(
            'п', 'ф', 'к', 'т', 'ш', 'с', 'х', 'ц', 'ч', 'щ'
    );

    public static void findMissingVoicelessConsonants(String filename) {

        Set<Character> missingConsonants = new HashSet<>(VOICELESS_CONSONANTS);
        Set<Character> foundConsonants = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line.toLowerCase(), foundConsonants);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        missingConsonants.removeAll(foundConsonants);
        printSorted(missingConsonants);
    }

    private static void processLine(String line, Set<Character> foundConsonants) {
        for (char c : line.toCharArray()) {
            if (VOICELESS_CONSONANTS.contains(c)) {
                foundConsonants.add(c);
            }
        }
    }

    private static void printSorted(Set<Character> consonants) {
        if (consonants.isEmpty()) {
            System.out.println("Все глухие согласные встречаются в тексте");
            return;
        }

        List<Character> sorted = new ArrayList<>(consonants);
        Collections.sort(sorted);

        System.out.println("Глухие согласные, которых нет в тексте:");
        for (char c : sorted) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
