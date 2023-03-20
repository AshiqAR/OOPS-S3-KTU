// Write a Java program to illustrate Interface inheritance

interface Sleeping{
    void sleep();
}
interface Reading{
    void read();
}

class Student implements Sleeping,Reading{
    public void sleep(){
        System.out.println("Student is sleeping");
    }
    public void read(){
        System.out.println("Student is reading");
    }
}



public class InterfaceInheritance {
    public static void main(String args[]){
        Student s = new Student();

        s.sleep();
        s.read();
    }
}
