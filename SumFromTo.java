import java.util.Scanner;

public class SumFromTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num1 = input.nextLong();
        long num2 = input.nextLong();

        long sum = 0;
        for(long i = num1; i <= num2; i++) {
            sum+= i;
        }

        System.out.println(sum);
    }
}