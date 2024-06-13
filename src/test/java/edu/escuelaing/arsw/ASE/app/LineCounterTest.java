package edu.escuelaing.arsw.ASE.app;

import edu.escuelaing.arsw.ASE.util.LineCounter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class LineCounterTest {

    @Test
    public void testCountLOC() throws IOException {
        File file = new File("src/test/resources/testFile.java");
        assertEquals(9, LineCounter.countLOC(file));
    }

    @Test
    public void testCountPhysicalLines() throws IOException {
        File file = new File("src/test/resources/testFile.java");
        assertEquals(25, LineCounter.countPhysicalLines(file));
    }
}
