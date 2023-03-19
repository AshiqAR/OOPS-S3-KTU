/*

Write a Java program which creates a class named 'Employee' having the following 
members: Name, Age, Phone number, Address, Salary. It also has a method named 
'printSalary()' which prints the salary of the Employee. Two classes 'Officer' and 
'Manager' inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data 
members 'specialization' and 'department' respectively. Now, assign name, age, phone 
number, address and salary to an officer and a manager by making an object of both of 
these classes and print the same

*/


class Employee{
    String name;
    int age;
    String phoneNumber;
    String address;
    int salary;

    void printSalary(){
        System.out.println("Salary: "+salary);
    }
}

class Officer extends Employee{
    String specialisation;
}

class Manager extends Employee{
    String department;
}


public class Inheritance{
    public static void main(String args[]){
        Officer officer1 = new Officer();
        Manager manager1 = new Manager();

        // Details of officer
        officer1.name = "abc";
        officer1.age = 34;
        officer1.phoneNumber = "34349384";
        officer1.address = "24 Fleet Street , Park Lane";
        officer1.salary = 30000;
        officer1.specialisation = "Web Design";
    
        // Details of Manager
        manager1.name = "xyz";
        manager1.age = 43;
        manager1.phoneNumber = "99457724534";
        manager1.address = "27 Bakers Street , Perk City";
        manager1.salary = 56000;
        manager1.department = "Sales";

    
        System.out.print("\nOFFICER \n");
        System.out.println("Name : " + officer1.name);
        System.out.println("Age : " + officer1.age);
        System.out.println("Phone number : " + officer1.phoneNumber);
        System.out.println("Address : " + officer1.address);
        System.out.println("Specialisation : " + officer1.specialisation);
        officer1.printSalary();
            
        System.out.print("\nMANAGER \n");
        System.out.println("Name: " + manager1.name);
        System.out.println("Age: " + manager1.age);
        System.out.println("Phone number: " + manager1.phoneNumber);
        System.out.println("Address: " + manager1.address);
        System.out.println("Department : " + manager1.department);
        manager1.printSalary();
    }
}