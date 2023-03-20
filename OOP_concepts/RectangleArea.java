import java.util.Scanner;
class Area{
    float length,breadth;

    void setDim(float l,float b){
        length = l;
        breadth = b;
    }

    float getArea(){
        return length*breadth;
    }
}

public class RectangleArea{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: ");
        float l = s.nextFloat();
        float b = s.nextFloat();
        float area;

        Area areaObj = new Area();
        areaObj.setDim(l,b);
        area = areaObj.getArea();

        System.out.println("The area of the rectangle = "+area);
    }
}