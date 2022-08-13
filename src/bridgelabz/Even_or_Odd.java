package bridgelabz;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {

        int number , remainder;

        Scanner n= new Scanner(System.in);
        System.out.println("Please enter a Number : ");
        number =n.nextInt();

         remainder = number % 2;
        if ( remainder == 0)
        System.out.println(number +  " is even number");
        else
        System.out.println(number + " is odd number");

    }
}
