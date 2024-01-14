class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base Constructor....");
    }
    public void fun()
    {
        System.out.println("Base fun...");
    }
    
}

class Derived extends Base
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived Constructor...");
    }
    public void gun()
    {
        System.out.println("Derived gun");
    }
}
class DerivedX extends Base
{
    public int P,Q;
    public DerivedX()
    {
        System.out.println("DerivedX Constructor...");
    }
}

class Hierarchal
{
    public static void main(String A[])
    {
        DerivedX dobj1 = new DerivedX();
        Derived dobj2 = new Derived();
    }
}
