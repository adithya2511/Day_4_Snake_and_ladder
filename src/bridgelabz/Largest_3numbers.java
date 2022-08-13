package bridgelabz;

public class Largest_3numbers {
    public static void main(String[] args)
    {
        int x=10, y=14, z=2;

        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }

    }
}
