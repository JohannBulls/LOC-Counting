package edu.escuelaing.arsw.ASE.util;

import java.io.File;
import java.io.IOException;

public interface LineCounterImpl {

    int countPhysicalLines(File file) throws IOException;

    int countLOC(File file) throws IOException;
}
