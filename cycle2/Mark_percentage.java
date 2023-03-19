abstract class Marks{
    abstract float getPercentage();
}

class A extends Marks{
    float mark1,mark2,mark3;

    A(float a , float b, float c){
        mark1 = a;
        mark2 = b;
        mark3 = c;    
    }

    public float getPercentage(){ 
        return ((mark1 + mark2 + mark3)/300)*100;
    }
}

class B extends Marks{
    float mark1,mark2,mark3,mark4;

    B(float a , float b, float c,float d) {
        mark1 = a;
        mark2 = b;
        mark3 = c;    
        mark4 = d;
    }

    public float getPercentage(){
        return ((mark1+mark2+mark3+mark4 )/400)*100;
    }
}

public class Mark_percentage{
    public static void main(String[] args) {

        A a = new A(90f, 80f, 66f);
        System.out.println("Student 1 in Student-type A, Percentage = " +a.getPercentage());

        B b = new B(80f , 75f ,78f , 90f);
        System.out.println("Student 2 in Student-type B, Percentage = " +b.getPercentage());
    }   
}