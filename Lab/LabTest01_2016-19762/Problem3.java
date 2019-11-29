import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int degree = input.nextInt();
        double[] coefficients = new double[degree+1];

        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = input.nextDouble();
        }

        double x = input.nextDouble();
        double y = input.nextDouble();

        /* Write your code here */
        String which;

        if (y >polynomialFunction(degree, coefficients, x)) which = "above";
        else if (y < polynomialFunction(degree, coefficients, x)) which = "below";
        else which = "on";

        //System.out.println(polynomialFunction(degree, coefficients, x));
        System.out.print("The point is " + which + " the polynomial.");
    }

    public static double polynomialFunction(int degree, double[] coef, double x) {

        /* Write your code here */
        double result = 0;
        int i = 0;

        for(int d = degree; d >= 0; d--) {
            result += coef[i] * Math.pow(x, d);
            i++;
        }

        return result;
    }
}
