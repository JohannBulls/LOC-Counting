package edu.escuelaing.arsw.ASE.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * The LineCounter class provides utility methods for counting lines of code (LOC) and physical lines in a file.
 */
public class LineCounter {

    /**
     * Counts the total number of physical lines in the given file.
     *
     * @param file The file for which physical lines are counted.
     * @return The total number of physical lines in the file.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public static int countPhysicalLines(File file) throws IOException {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.readLine() != null) {
                lines++;
            }
        }
        return lines;
    }

    /**
     * Counts the number of lines of code (LOC) in the given file, excluding empty lines and comments.
     *
     * @param file The file for which lines of code are counted.
     * @return The number of lines of code (LOC) in the file.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public static int countLOC(File file) throws IOException {
        int loc = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty() && !line.startsWith("//") && !line.startsWith("/*")) {
                    loc++;
                }
            }
        }
        return loc;
    }
}
