
class Demo extends Thread
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println("Current thread is : "+Thread.currentThread().getName());
        for(int i = 1; i < 100; i++)
        {
            System.out.println("Name of Thread is : "+name+" with counter : "+i);
        }
    }
}

class Multi3
{
    public static void main(String Arg[])
    {
        System.out.println("Current Thread is : "+Thread.currentThread().getName());

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.setName("First_Thread");
        obj2.setName("Current_Thread");

        obj1.start();
        obj2.start();
    }
}