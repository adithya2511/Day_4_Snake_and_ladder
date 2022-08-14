package Assaignment_Day_6;

public class Reverse_number {
    public static void main(String[] args) {

        int n = 1234, reversed = 0;


        // run loop until num becomes 0
        while (n != 0) {

            // get last digit from num
            int digit = n % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            n /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}