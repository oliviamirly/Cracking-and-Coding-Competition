import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numWords = input.nextInt();
        String[] words = new String[numWords];
        for(int i = 0; i < words.length; i++) {
            words[i] = input.next();
        }

        for(int i = 0; i < words.length; i++) {
            words[i].strip();
            if(!words[i].isEmpty()) {
                String first = words[i].substring(0, 1).toUpperCase();
                words[i] = first + words[i].substring(1, words[i].length()).toLowerCase();
            }

        }

        for(int i = 0; i < words.length; i++) {
            if(!words[i].isEmpty()) {
                System.out.print(words[i] + " ");
            }
        }
    }
}
