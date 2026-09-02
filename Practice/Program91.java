import java.util.*;

class Program91
{
    public static void main(String A[])
    {

        Scanner sobj=new Scanner(System.in);
        DigitX dobj=new DigitX();

        int iValue=0;
        int iRet=0;

        System.out.println("enter number:");
        iValue=sobj.nextInt();

        iRet=dobj.SumEvenDigits(iValue);

        System.out.println("summation of Even digits are:"+iRet);
    }
    
}

class DigitX
{
    public int SumEvenDigits(int iNo)
    {
        int iDigit=0;
        int isum=0;
        
        while(iNo!=0)
        {
            iDigit=iNo%10;
            
            if(iDigit%2==0)
            {
                isum=isum+iDigit;
            }

            iNo=(iNo/10);
            
        }
        return isum;
      
    }
}
//notes for evrey program

