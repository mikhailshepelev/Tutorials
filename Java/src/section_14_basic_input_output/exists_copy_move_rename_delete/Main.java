package section_14_basic_input_output.exists_copy_move_rename_delete;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        try {
            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
            Files.copy(sourceFile, copyFile);
            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
            Files.deleteIfExists(fileToDelete);

            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Path destination = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Files.move(fileToMove, destination);

            Path sourceFile2 = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Path copyFile2 = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
            Files.copy(sourceFile2, copyFile2, StandardCopyOption.REPLACE_EXISTING);

            sourceFile2 = FileSystems.getDefault().getPath("Examples", "Dir1");
            copyFile2 = FileSystems.getDefault().getPath("Examples", "Dir4");
            Files.copy(sourceFile2, copyFile2, StandardCopyOption.REPLACE_EXISTING);

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
