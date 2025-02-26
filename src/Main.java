public class Main {
    public static void main(String[] args) {
        WordMatch wordMatch = new WordMatch("concatenation");
        System.out.println(wordMatch.scoreGuess("ten"));
        System.out.println(wordMatch.scoreGuess("nation"));
        System.out.println(wordMatch.findBetterGuess("ten" , "nation"));
        System.out.println(wordMatch.scoreGuess("con"));
        System.out.println(wordMatch.scoreGuess("cat"));
        System.out.println(wordMatch.findBetterGuess("con" , "cat"));
    }
}