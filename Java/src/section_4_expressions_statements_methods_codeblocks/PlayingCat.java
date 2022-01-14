package section_4_expressions_statements_methods_codeblocks;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (summer && temperature >= 25 && temperature <= 45) ||
                (!summer && temperature >= 25 && temperature <= 35);
    }
}
