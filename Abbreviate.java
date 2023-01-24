public class Abbreviate {
    public static void main(String[] args) {
        String word = args[0];
        if (word.length() < 8) {
            System.out.println(word);
        } else {
            String abbr1 = word.substring(0, 2);
            String abbr2 = word.substring(word.length() - 2, word.length());
            System.out.println(abbr1 + "..." + abbr2);
        }
    }
}
