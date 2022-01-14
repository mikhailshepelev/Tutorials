package section_4_expressions_statements_methods_codeblocks;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int remainingKilobytes = kiloBytes;
        int megaBytes = 0;

        while (remainingKilobytes >= 1024) {
            megaBytes++;
            remainingKilobytes -= 1024;
        }

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
    }
}