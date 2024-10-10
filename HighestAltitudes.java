import java.util.Scanner;

public class HighestAltitudes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elements = input.nextInt();
        int[] alts = new int[elements];
        for(int i = 0; i < elements; i++) {
            alts[i] = input.nextInt();
        }

        int highestAlt = 0;
        int currentAlt = 0;
        for(int i = 0; i < alts.length; i++) {
            currentAlt = currentAlt + alts[i];
            if(currentAlt > highestAlt) {
                highestAlt = currentAlt;
            }
        }

        System.out.println(highestAlt);
    }
}
