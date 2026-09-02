import java.util.*;

class Program89
{
    public static void main(String A[])
    {

        Scanner sobj=new Scanner(System.in);
        DigitX dobj=new DigitX();

        int iValue=0;
        int iRet=0;

        System.out.println("enter number:");
        iValue=sobj.nextInt();

        iRet=dobj.SumDigits(iValue);

        System.out.println("summation of digits are:"+iRet);
    }
    
}

class DigitX
{
    public int SumDigits(int iNo)
    {
        int iDigit=0;
        int isum=0;
        
        while(iNo!=0)
        {
            iDigit=iNo%10; 
            
            isum=isum+iDigit;

            iNo=(iNo/10);
            
        }
        return isum;
      
    }
}

