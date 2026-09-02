import java.util.*;
class Program88
{
    public static void main(String A[])
    {

        Scanner sobj=new Scanner(System.in);
        DigitX dobj=new DigitX();

        int iValue=0;

        System.out.println("enter number:");
        iValue=sobj.nextInt();

        dobj.CountEvenoddDigits(iValue);

    }
    
}

class DigitX
{
    public void CountEvenoddDigits(int iNo)
    {
        int iDigit=0;
        int iCountEVen=0,iCountOdd=0;
        
        while(iNo!=0)
        {
            iDigit=iNo%10;

            if(iDigit % 2==0)
            {
                iCountEVen++;
            }
            else
            {
                iCountOdd++;
            }

            iNo=(iNo/10);
            
        }
        System.out.println("number of even digits:"+iCountEVen);
        System.out.println("number of Odd digits:"+iCountOdd);
      
    }
}

