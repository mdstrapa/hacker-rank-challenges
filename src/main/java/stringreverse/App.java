package stringreverse;

public class App {
    public static void main(String[] args) {}

    public String stringReverse(String input){
        String revertedString = "";
        for (Character c:input.toCharArray()) {
            revertedString = c + revertedString;
        }
        return revertedString;
    }
}
