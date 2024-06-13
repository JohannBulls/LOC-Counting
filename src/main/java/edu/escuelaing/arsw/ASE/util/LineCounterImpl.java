package edu.escuelaing.arsw.ASE.util;

import java.io.File;
import java.io.IOException;

/**
 * The LineCounterImpl interface defines methods for counting lines of code (LOC) and physical lines in a file.
 */
public interface LineCounterImpl {

    /**
     * Counts the total number of physical lines in the given file.
     *
     * @param file The file for which physical lines are counted.
     * @return The total number of physical lines in the file.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    int countPhysicalLines(File file) throws IOException;

    /**
     * Counts the number of lines of code (LOC) in the given file, excluding empty lines and comments.
     *
     * @param file The file for which lines of code are counted.
     * @return The number of lines of code (LOC) in the file.
     * @throws IOException If an I/O error occurs while reading the file.
     */
    int countLOC(File file) throws IOException;
}
