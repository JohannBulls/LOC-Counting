package edu.escuelaing.arsw.ASE.app;

import edu.escuelaing.arsw.ASE.util.LineCounter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * This class contains JUnit tests for the LineCounter utility class.
 * It verifies the functionality of counting lines of code (LOC) and physical lines
 * in a Java source code file using the LineCounter utility methods.
 */
public class LineCounterTest {

    /**
     * Test case to verify the accuracy of counting lines of code (LOC) in a Java file.
     *
     * @throws IOException if an I/O error occurs while reading the file
     */
    @Test
    public void testCountLOC() throws IOException {
        File file = new File("src/test/resources/testFile.java");
        assertEquals(9, LineCounter.countLOC(file));
    }

    /**
     * Test case to verify the accuracy of counting physical lines in a Java file.
     *
     * @throws IOException if an I/O error occurs while reading the file
     */
    @Test
    public void testCountPhysicalLines() throws IOException {
        File file = new File("src/test/resources/testFile.java");
        assertEquals(25, LineCounter.countPhysicalLines(file));
    }
}
