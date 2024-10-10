import java.util.Scanner;

public class EvaluatePolynomial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int degree = input.nextInt();
        int[] coeffs = new int[degree + 1];
        for(int i = 0; i < coeffs.length; i++) {
            coeffs[i] = input.nextInt();
        }
        int x = input.nextInt();

        long sum = 0;
        for(int i = 0; i < coeffs.length; i++) {
            int coeff = coeffs[i];
            int deg = degree - i;
            sum += coeff * Math.pow(x, deg);
        }

        System.out.println(sum);
    }
}
