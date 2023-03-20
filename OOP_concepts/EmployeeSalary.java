import java.util.Scanner;

class Employee{
    float salary;
    float hours_perDay;

    void getInfo(float salary,float hours_perDay){
        this.salary = salary;
        this.hours_perDay = hours_perDay;
    }

    void addSal(){
        if(salary<500){
            salary+=10;
        }
    }

    void AddWork(){
        if(hours_perDay>6){
            salary+=5;
        }
    }

    float returnSalary(){
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Employee E = new Employee();

        System.out.println("Enter Details of the Employee");
        System.out.print("Enter the salary: ");
        float salary = s.nextFloat();
        System.out.print("Enter the working hours: ");
        float hours = s.nextFloat();

        E.getInfo(salary, hours);
        E.addSal();
        E.AddWork();

        System.out.println();
        System.out.println("Final salary of the Employee = "+E.returnSalary());
    }
}