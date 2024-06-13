package edu.escuelaing.arsw.ASE.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * The FileUtil class provides utility methods for file operations.
 */
public class FileUtil {

    /**
     * Retrieves a list of files matching the specified pattern within the base directory.
     *
     * @param pattern The pattern used to match files or directories.
     * @return A list of files that match the given pattern.
     */
    public static List<File> getFiles(String pattern) {
        List<File> files = new ArrayList<>();
        File baseDir = new File(pattern).getAbsoluteFile().getParentFile();
        String globPattern = new File(pattern).getName();

        try {
            Files.walk(Paths.get(baseDir.toURI()))
                    .filter(path -> path.toFile().isFile() && path.toFile().getName().matches(globPattern.replace("*", ".*")))
                    .forEach(path -> files.add(path.toFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return files;
    }
}
