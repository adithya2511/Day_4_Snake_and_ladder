package bridgelabz;

public class LeapYear{

        public static void main(String[] args) {
            int year = 2020 ;
            boolean leap ;

            //A year divisible by 4 is a leap year
            if (year % 4 == 0) {

                //It is a centenary year if the value is divisible by 100 with no remainder.
                if (year % 100 == 0) {

                    //Centenary year is a leap year divided by 400
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }

                // if the year is not a century
                else
                    leap = true;
            }
            //The Year is not a leap year
            else
                leap = false;

            if (leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
    }
