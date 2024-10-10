import java.util.Scanner;

public class RemoveAllVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numWords = input.nextInt();
        String[] words = new String[numWords];
        for(int i = 0; i < words.length; i++) {
            words[i] = input.next();
        }

        for(int i = 0; i < words.length; i++) {
            while (words[i].indexOf('a') > -1) {
                words[i] = words[i].substring(0, words[i].indexOf('a')) + words[i].substring(words[i].indexOf('a') + 1);
            }
            while (words[i].indexOf('e') > -1) {
                words[i] = words[i].substring(0, words[i].indexOf('e')) + words[i].substring(words[i].indexOf('e') + 1);
            }
            while (words[i].indexOf('i') > -1) {
                words[i] = words[i].substring(0, words[i].indexOf('i')) + words[i].substring(words[i].indexOf('i') + 1);
            }
            while (words[i].indexOf('o') > -1) {
                words[i] = words[i].substring(0, words[i].indexOf('o')) + words[i].substring(words[i].indexOf('o') + 1);
            }
            while (words[i].indexOf('u') > -1) {
                words[i] = words[i].substring(0, words[i].indexOf('u')) + words[i].substring(words[i].indexOf('u') + 1);
            }
            while (words[i].indexOf('A') > -1) {
                words[i] = words[i].substring(0, words[i].indexOf('A')) + words[i].substring(words[i].indexOf('A') + 1);
            }
            while (words[i].indexOf('E') > -1) {
                words[i] = words[i].substring(0, words[i].indexOf('E')) + words[i].substring(words[i].indexOf('E') + 1);
            }
            while (words[i].indexOf('I') > -1) {
                words[i] = words[i].substring(0, words[i].indexOf('I')) + words[i].substring(words[i].indexOf('I') + 1);
            }
            while (words[i].indexOf('O') > -1) {
                words[i] = words[i].substring(0, words[i].indexOf('O')) + words[i].substring(words[i].indexOf('O') + 1);
            }
            while (words[i].indexOf('U') > -1) {
                words[i] = words[i].substring(0, words[i].indexOf('U')) + words[i].substring(words[i].indexOf('U') + 1);
            }
        }

        for(int i = 0; i < words.length; i++) {
            if(!words[i].isEmpty())
            System.out.print(words[i] + " ");
        }

    }
}
