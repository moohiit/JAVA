// WAP to create a employee record system with salary management. 
// (by using getempinfo() and disempinfo() method

import java.util.Scanner;

public class _31_Employee_details{
    int emp_id,emp_salary;
    String emp_name,emp_depart;
    
    //Method to store employee details:
    public void getempinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("** Enter Employee Details **\n");
        System.out.print("Enter Employee ID : ");
        emp_id = sc.nextInt();        
        emp_name = sc.nextLine();
        System.out.print("Enter Employee Name : ");
        emp_name = sc.nextLine();
        System.out.print("Enter Employee Department : ");
        emp_depart = sc.nextLine();
        System.out.print("Enter Employee Salary : ");
        emp_salary = sc.nextInt();
    }

    //Method to display employee details.
    public void disempinfo(){
        System.out.println("** Employee Details **\n");
        System.out.println("Employee ID : "+emp_id);
        System.out.println("Employee Name : "+emp_name);
        System.out.println("Employee Department : "+emp_depart);
        System.out.println("Employee Salary : "+emp_salary);
    }
    
    public static void main(String[] args) {
        _31_Employee_details ed = new _31_Employee_details();
        ed.getempinfo();
        ed.disempinfo();
    }
}