import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dim = input.nextInt();

        long[][] matA = new long[dim][dim];
        long[][] matB = new long[dim][dim];

        for(int row = 0; row < dim; row++) {
            for(int col = 0; col < dim; col++) {
                matA[row][col] = input.nextInt();
            }
        }

        //for the loops, the word based variables refer to how they exist relativ to matA
        for(int row = 0; row < dim; row++) {
            for(int col = 0; col < dim; col++) {
                matB[col][dim - 1 - row] = matA[row][col];
            }
        }

        for(int row = 0; row < dim; row++) {
            for(int col = 0; col < dim; col++) {
                System.out.print(matB[row][col] + " ");
            }
            System.out.println();
        }
    }
}
