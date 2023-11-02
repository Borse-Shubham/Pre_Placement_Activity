
class Demo extends Thread
{
    public void run()
    {

    }
}

class Multi6
{
    public static void main(String Arg[])
    {
        System.out.println("Current Thread is..."+Thread.currentThread().getName());

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.start();
        obj2.start();

        System.out.println("Priority od obj1 is : "+obj1.getPriority());
        System.out.println("Priority od obj2 is : "+obj2.getPriority());

        obj1.setPriority(8);
        obj2.setPriority(10);

        System.out.println("Priority od obj1 is : "+obj1.getPriority());
        System.out.println("Priority od obj2 is : "+obj2.getPriority());

    }
}