public class NegatePhrase {
    public static void main(String[] args) {
        String sentence = args[0];
        if (sentence.substring(0, 3).equals("not")) {
            String result = sentence;
            System.out.println(result);
        } else {
            String result = ("not " + sentence);
            System.out.println(result);
        }
    }
}
