package bridgelabz;

import java.util.Scanner;

public class Quotient_Remainder {

        public static void main(String[] args) {

            int dividend , divisor;

            System.out.println("Enter the dividend : ");
            Scanner n = new Scanner(System.in);
            dividend = n.nextInt();

            System.out.println("Enter the divisor : ");
            divisor = n.nextInt();


            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println(" Quotient = " + quotient);
            System.out.println(" Remainder = " + remainder);
        }
    }