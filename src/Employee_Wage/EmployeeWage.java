package Employee_Wage;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println(" Welcome to Employee Wage Computation ");
        int empAttendence = (int)Math.floor(Math.random()*10) %2;
        if(empAttendence == 1)
            System.out.println("Employee Present");
        else
            System.out.println("Employee Absent");
    }
}
