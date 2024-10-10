import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elements = input.nextInt();
        int[] arr = new int[elements];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                int zeroIdx = i;
                while(zeroIdx != arr.length - 1) {
                    swap(arr, zeroIdx, zeroIdx + 1);
                    zeroIdx++;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
