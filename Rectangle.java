import java.util.Scanner;

public class Rectangle {
    int len, wid;
    Rectangle(int x , int y){           //Defining Constructor
        len = x;
        wid = y;
    }
    int AreaRect(){
        return (len * wid);
    }
}
class AreaRectangle{
    public static void main(String args[]){
        Rectangle Rec1 = new Rectangle(20, 10);             // calling constructor
        int Area1 = Rec1.AreaRect();
        System.out.println("Area = "+Area1);
    }
}