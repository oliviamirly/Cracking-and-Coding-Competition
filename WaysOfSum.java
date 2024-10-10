import java.util.Scanner;

public class WaysOfSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();

        long count = 0;
        for(long i = 1; i < num; i++) {
            long sum = 0;
            long adder = i;
            while(sum <= num) {
                if(sum == num) {
                    count++;
                    break;
                } else {
                    sum += adder;
                    adder++;
                }
            }
        }

        System.out.println(count);
    }
}
