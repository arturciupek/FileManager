package org.example;

import java.io.File;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class FileManager {
    public void listFileInDirectory(String directory) {
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isFile)
                .map(File::getName)
                .forEach(System.out::println);

    }
    public void sortFileInDirectory(String directory) {
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isFile)
                .sorted(Comparator.comparingLong(File::length))
                .forEach(file -> {
                    System.out.println(file.getName());
                    System.out.println(file.length());
                    System.out.println();
                });
    }
}