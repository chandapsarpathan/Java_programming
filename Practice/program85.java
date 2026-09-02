import java.util.*;
class Program85
{
    public static void main(String A[])
    {

        Scanner sobj=new Scanner(System.in);
        DigitX dobj=new DigitX();

        int iValue=0;
        int iRet=0;

        System.out.println("enter number:");
        iValue=sobj.nextInt();

        iRet=dobj.CountDigits(iValue);

        System.out.println("number of 7 digits are:"+iRet);
    }
    
}

class DigitX
{
    public int CountDigits(int iNo)
    {
        int iDigit=0;
        int iCount=0;
        
        while(iNo!=0)
        {
            iDigit=iNo%10;

            if(iDigit==7)
            {

                iCount++;
            }
            

            iNo=(iNo/10);
            
        }
        return iCount;
      
    }
}

