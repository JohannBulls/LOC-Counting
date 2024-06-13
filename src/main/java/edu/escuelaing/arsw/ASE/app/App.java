package edu.escuelaing.arsw.ASE.app;

import edu.escuelaing.arsw.ASE.util.FileUtil;
import edu.escuelaing.arsw.ASE.util.LineCounter;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java App <type> <file/directory pattern>");
            return;
        }

        String type = args[0];
        String pattern = args[1];

        List<File> files = FileUtil.getFiles(pattern);

        for (File file : files) {
            try {
                if (type.equals("phy")) {
                    System.out.println("File: " + file.getName() + " - Physical Lines: " + LineCounter.countPhysicalLines(file));
                } else if (type.equals("loc")) {
                    System.out.println("File: " + file.getName() + " - LOC: " + LineCounter.countLOC(file));
                } else {
                    System.out.println("Invalid type. Use 'phy' for physical lines or 'loc' for lines of code.");
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + file.getName());
                e.printStackTrace();
            }
        }
    }
}
