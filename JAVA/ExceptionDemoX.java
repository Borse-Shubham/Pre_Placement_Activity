import java.util.*;

class ExceptionDemoX
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        try
        { 
            System.out.println("Inside try block");
            iAns = iNo1 / iNo2;
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch " +obj);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Array index out of bounds exception")
        }
        catch (Exception obj)
        {
            System.out.println("Inside generic catch block " +obj);
        }
        finally
        {
            System.out.println("Inside finally block");
        }

        System.out.println("Division is : "+iAns);
    }
}