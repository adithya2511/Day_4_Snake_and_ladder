package Employee_Wage;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;

    static final int FULL_DAY_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    static final int IS_PART_TIME = 1;

    static final int IS_FULL_TIME = 2;

    static final int WORKING_DAYS_PER_MONTH = 20;

    static final int WORKING_HOUR_PER_MONTH = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int dayCount = 1;
        int workingHours = 0;
        int totalWage = 0;
        while (dayCount <= WORKING_DAYS_PER_MONTH && workingHours <= WORKING_HOUR_PER_MONTH) {
            int empPresent = (int) Math.floor(Math.random() * 10) % 3;
            int empWage = 0;
            switch (empPresent) {
                case IS_FULL_TIME:
                    empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    workingHours += FULL_DAY_HOUR;
                    System.out.println("Employee FULL TIME");
                    break;
                case IS_PART_TIME:
                    empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    workingHours += PART_TIME_HOUR;
                    System.out.println("Employee PART TIME");
                    break;
                default:
                    System.out.println("Employee Absent");
            }
            totalWage += empWage;
            System.out.println("Employee Daily Wage Day #" +dayCount +"=> " + empWage);
            dayCount++;
        }
        System.out.println("Working Hours " +workingHours);
        System.out.println("Total Wage "+ totalWage);
    }
}