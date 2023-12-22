package mirea.javalabs.lab19;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class DirectoryListing {
    public static List<String> listDirectoryContents(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            String[] contents = directory.list();
            if (contents != null) {
                return Arrays.asList(contents).subList(0, Math.min(contents.length, 5));
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        String directoryPath = "/C:/Users/coolp/IdeaProjects/mirea prodegy/src/mirea/javalabs";
        List<String> result = listDirectoryContents(directoryPath);
        System.out.println(result);
    }
}

