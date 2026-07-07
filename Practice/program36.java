import java.util.Scanner;    //for scanner to get input

class Program36
{
    {
        Scanner sobj=new Scanner(System.in);

        String SName=null;
        int iAge=0;
        float fMarks=0.0f;

        System.out.println("Enter your name");
        SName=sobj.nextLine();

        System.out.println("Enter your age");
        iAge=sobj.nextInt();

        System.out.println("enter your marks");
        fMarks=sobj.nextFloat();

        System.out.println("name:"+SName);
        System.out.println("Age:"+iAge);
        System.out.println("Marks:"+fMarks);

    }
}