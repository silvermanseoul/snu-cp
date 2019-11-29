import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a natural number: ");
        int endNumber = input.nextInt();

        /* Write your code here */
        for(int i = 1; i < endNumber; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(endNumber);
    }
}
