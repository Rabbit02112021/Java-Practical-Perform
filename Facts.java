import java.util.Scanner;

public class Facts {
    public static void main(String sus[]){
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int fact = 1;
        for (int i = x; i>= 1; i--){
            fact = fact *i;
        }
        System.out.println("factorial of " +fact);
    }
}
