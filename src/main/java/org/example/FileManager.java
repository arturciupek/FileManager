package org.example;

import java.io.File;
import java.util.Objects;
import java.util.stream.Stream;

public class FileManager {
    public void listFileInDirectory(String directory) {
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isFile)
                .map(File::getName)
                .forEach(System.out::println);

    }
}