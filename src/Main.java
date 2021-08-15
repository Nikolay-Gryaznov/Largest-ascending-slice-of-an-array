import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        int[] lens = new int[n];
        for(int i=0; i<n; i++){
            array[i] = in.nextInt();
        }
        int max = 0;
        for(int i=1; i<n; i++) {
            if (array[i]>array[i-1]) lens[i] = lens[i-1]+1;
            else lens[i] = 0;
            max = Math.max(lens[i], max);
        }
        System.out.println(max + 1);
        for(int i=0; i<n; i++) {
            if (lens[i] == max) {
                for(int j=i-lens[i]; j<=i; j++) {
                    System.out.print(array[j] + " ");
                }
                System.out.println();

            }
        }
    }
}