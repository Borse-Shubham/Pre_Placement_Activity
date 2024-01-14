class Base 
{
    public void fun()
    {   System.out.println("Inside base fun");}
    public void gun()
    {   System.out.println("Inside base gun");}
    public void sun()
    {   System.out.println("Inside base sun");}
    public void run()
    {   System.out.println("Inside base run");}
    
}

class Derived extends Base
{
    public void fun()
    {   System.out.println("Inside derived fun");}
    public void sun()
    {   System.out.println("Inside derived sun");}
    public void run(int A)
    {   System.out.println("Inside derived run");}
    public void mun()
    {   System.out.println("Inside derived mun");}
}

class Overriding
{
    public static void main (String arg[])
    {
        Base bobj = new Derived();
        // Base bobj = new Base ();
        bobj.fun();
        bobj.gun();
        bobj.sun();
        bobj.run();
    }
}