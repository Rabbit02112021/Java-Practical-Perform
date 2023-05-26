                                     //Method--Overloading //
   public class M_Over {
    void add()
    {
        int a = 10, b= 20, c;
        c= a+b;
        System.out.println(c);
    }
    void add(int x, int y)
    {
        int c;
        c= x+y;
        System.out.println(c);
    }

    void add(int x, int y, int z)
    {
        int c;
        c= x+y+z;
        System.out.println(c);
    }
    public static void main(String args[]){
        M_Over r = new M_Over();
        r.add();
        r.add(20,10);
        r.add(40,20,30);
    }

}
