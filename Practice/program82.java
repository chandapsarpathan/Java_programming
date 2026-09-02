import java.util.*;
class Program79
{
    public static void main(String A[])
    {

        Scanner sobj=new Scanner(System.in);
        DigitX dobj=new DigitX();

        int iValue=0;

        System.out.println("enter number:");
        iValue=sobj.nextInt();

        dobj.DisplayDigits(iValue);
    }
    
}

class DigitX
{
    public void DisplayDigits(int iNo)
    {
        int iDigit=0;
        
        for(;iNo!=0; )
        {
            
            iDigit=iNo%10;
            

            System.out.println(iDigit);
            iNo=iNo/10;

            
        }
    }
}

