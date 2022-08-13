package bridgelabz;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
        int h_cnt = 0;
        int t_cnt = 0;
        int count =1;
        double random = 0;

        System.out.println("Flip a coin no.of Times : " +random);
        Scanner scan = new Scanner(System.in);
        int flips= scan.nextInt();

        while(count <= flips) {
            random = Math.random();

            if (random < 0.5) {
                h_cnt++;
                System.out.println("Heads");
            }
            else {
                t_cnt++;
                System.out.println("Tails");
            }
            count++;
        }
        System.out.println("number of heads "+ h_cnt );
        System.out.println("number of Tails "+ t_cnt );

         // Temporary variables and PERCENTAGE CALCULATION
        double a = h_cnt / (double) flips * 100;
        double b = t_cnt / (double) flips * 100;

        System.out.println("Head percentage is " + a + "%");
        System.out.println("Tail percentage is " + b + "%");
    }
}
