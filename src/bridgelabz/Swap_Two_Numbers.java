package bridgelabz;

public class Swap_Two_Numbers {
    public static void main(String[] args) {

        int a = 999, b = 888;
        System.out.println("a is "+a);
        System.out.println("b is "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping");
        System.out.println("a is  " + a);
        System.out.println("b is  " + b);

    }
}
