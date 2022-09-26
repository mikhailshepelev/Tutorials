package section_14_basic_input_output.read_directory_content;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter =
//                new DirectoryStream.Filter<Path>() {
//                    public boolean accept(Path path) throws IOException {
//                        return (Files.isRegularFile(path));
//                    }
//                };

        DirectoryStream.Filter<Path> filter = Files::isRegularFile;

        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");  // FileTree\\Dir2 (windows)
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }

        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }
    }
}
