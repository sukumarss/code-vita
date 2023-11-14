import java.util.Scanner;

public class PhiloLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = findMinDenominations(n);

        System.out.println(x);
    }

    private static int findMinDenominations(int n) {
        int x = 0;
        
        while (Math.pow(2, x) <= n) {
            x++;
        }

        return x;
    }
}
