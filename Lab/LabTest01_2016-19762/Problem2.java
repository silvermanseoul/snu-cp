import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String inputString = input.nextLine();

        /* Write your code here */
        for(int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) == 'x') System.out.print('/');
            else System.out.print(inputString.charAt(i));
        }
    }
}
