
public class Abbreviate {
    public static void main(String[] args) {
        String word = args[0];
        if (word.length() < 8) {
            String result = word;
            System.out.println(result);
        } else {
            String abbr1 = word.substring(0, 2);
            String abbr2 = word.substring(word.length() - 2, word.length());
            String result = (abbr1 + "..." + abbr2);
            System.out.println(result);
        }
    }
}
