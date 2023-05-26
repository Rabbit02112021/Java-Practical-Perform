                                                 //  Default Parametrized Constructor
public class D_Para_Const {
    // Default constructor created by programmer

    D_Para_Const(){
        System.out.println("Default Constructor");
    }

    private String n1;
    D_Para_Const(String name){
        this.n1=name;
        System.out.println("Parameterized constructor with one String argument.\n"+"Name: "+n1);
    }

    private int n2;
    D_Para_Const(String name, int age){
        this.n1=name;
        this.n2=age;
        System.out.println("Parameterized constructor with one string and one integer argument.\n"+"Name:"+n1+" Age:"+n2);
    }

    public static void main(String[] args) {

        D_Para_Const s1 = new D_Para_Const();

        D_Para_Const s2 = new D_Para_Const("Sushil Kumar");

        D_Para_Const s3 = new D_Para_Const("Ankit Raj", 21);
    }
}
