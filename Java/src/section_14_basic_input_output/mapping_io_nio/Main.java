package section_14_basic_input_output.mapping_io_nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("/Examples/file.txt");   // C:\\Examples\file.txt
        Path convertedPath = file.toPath();
        System.out.println("convertedPath = " + convertedPath);

        File parent = new File("/Examples");  // C:\\Examples
        File resolvedFile = new File(parent, "dir/file.txt");  // dir\\file.txt
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("/Examples", "dir/file.txt");  // C:\\Examples   dir\\file.txt
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("/Examples");  // C:\\Examples
        Path childRelativePath = Paths.get("dir/file.txt");  // dir\\file.txt
        System.out.println(parentPath.resolve(childRelativePath));

        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory = " + workingDirectory.getAbsolutePath());

        System.out.println("--- print Dir2 contents using list() ---");
        File dir2File = new File(workingDirectory, "/FileTree/Dir2");   // \\FileTree\Dir2
        String[] dir2Contents = dir2File.list();
        for(int i=0; i< dir2Contents.length; i++) {
            System.out.println("i= " + i + ": " + dir2Contents[i]);
        }

        System.out.println("--- print Dir2 contents using listFiles() ---");
        File[] dir2Files = dir2File.listFiles();
        for(int i=0; i< dir2Files.length; i++) {
            System.out.println("i= " + i + ": " + dir2Files[i].getName());
        }
    }
}
