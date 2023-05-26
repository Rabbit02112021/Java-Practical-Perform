import java.util.Scanner;

public class cmd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of length:-->");
        double l = sc.nextDouble();
        System.out.println("Enter the value of Wirth");
        double b = sc.nextDouble();

        double Area = l * b ;

        if (Area > 20)
        {
            System.out.println("large area");
        }
        else {
            System.out.println("ok no problems");
        }

        System.out.println("Area of Rectangle Is:"+ Area);
    }
}