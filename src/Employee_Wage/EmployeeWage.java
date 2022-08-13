package Employee_Wage;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int empAttendence = (int)Math.floor(Math.random()*10) %2;

        int empWage = 0;
        if(empAttendence == 1) {
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee Present");
        }else
            System.out.println("Employee Absent");
        System.out.println("Employee Wage => "+empWage);
    }
}
