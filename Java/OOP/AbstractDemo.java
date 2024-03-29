
abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Demo Constructor...\n");
        this.A = 0;
        this.B = 0;
    }
    abstract void fun();        //virtual void fun() = 0; in C++

    void gun()                  
    {
        System.out.println("Inside gun...\n");
    }
}

class Hello extends Demo
{
    public Hello()
    {
        System.out.println("Inside Hello Constructor...\n");
    }

    public void fun()
    {
        System.out.println("Inside fun of Hello...\n");   
    }
}

class AbstractDemo
{
    public static void main(String arg[])
    {
            //Demo obj = new Demo();        Error
            Hello hobj = new Hello();
            hobj.fun();
            hobj.gun();
    }
}