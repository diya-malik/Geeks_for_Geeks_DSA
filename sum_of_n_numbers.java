import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
        return;
    }
} // O(n)

// return n*(n+1)/2 O(1)