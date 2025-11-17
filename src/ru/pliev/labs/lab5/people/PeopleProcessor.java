package ru.pliev.labs.lab5.people;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class PeopleProcessor {
    public static void processPeople(String filename) {
        List<String> lines = new ArrayList<>();
        Map<Integer, List<String>> result = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            result = lines.stream()
                    .map(lineSplit -> lineSplit.split(":"))
                    .filter(parts -> parts.length == 2 && !parts[1].trim().isEmpty())
                    .map(parts -> new Person(
                            capitalize(parts[0].trim().toLowerCase()),
                            Integer.parseInt(parts[1].trim())
                    ))
                    .collect(Collectors.groupingBy(
                            Person::getNumber,
                            Collectors.mapping(Person::getName, Collectors.toList())
                    ));
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа в файле");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        Map<Integer, List<String>> sortedMap = new TreeMap<>(result);
        sortedMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
    private static String capitalize(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
