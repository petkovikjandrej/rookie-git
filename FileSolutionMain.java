package files.impl;

import java.io.File;
import java.io.FileNotFoundException;

public class FileSolutionMain {
    public static String filePath = "C:\\Users\\Andrej\\Downloads";

    public void filterFilesInDirBySize(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        if (!file.isDirectory())
            throw new FileNotFoundException();

        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory())
                break;

            if (f.length()/1000 > 50)
                System.out.println(f.getName());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileSolutionMain solutionMain = new FileSolutionMain();
        solutionMain.filterFilesInDirBySize(filePath);
    }
}
