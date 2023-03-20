/*

Write two Java classes Employee and Engineer. Engineer should inherit from Employee 
class. Employee class to have two methods display() and calcSalary(). Write a program 
to display the engineer salary and to display from Employee class using a single object 
instantiation (i.e., only one object creation is allowed). 
    • display() only prints the name of the class and does not return any value. Ex. "Name of class is Employee.” 
    • calcSalary() in Employee displays “Salary of employee is 10000” and calcSalary() 
       in Engineer displays “Salary of employee is 20000.”

 */

 class Employee{
    void display(){
        System.out.println("Name of the class is Employee");
    }
    void calcSalary(){
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee{
    void display(){
        super.display();
        System.out.println("Name of the class is Engineer");
    }
    void calcSalary(){
        super.calcSalary();
        System.out.println("Salary of engineer is 20000");
    }
}

public class MethodOverriding {
    public static void main (String args[]){
        Engineer e1 = new Engineer();
        e1.display();
        e1.calcSalary();
    }
}
