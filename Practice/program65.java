import java.util.Scanner;

class NumberX
{
    public boolean CheckPrime(int iNo)   //prime not divide in any number  
    {
       int iCnt=0;

       for(iCnt=2; iCnt<= (iNo/2); iCnt++)
       {
        if((iNo % iCnt)==0)
        {
          break;
        } 
       }
       if(iCnt >= (iNo/2)+1)    //study for this
       {
        return true;
       }
       else
       {
        return false;
       }
    }
}
class program65
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int iValue=0;
        boolean bRet=false;


        System.out.println("Enter number");

        iValue=sobj.nextInt();

        NumberX nobj=new NumberX();

        bRet=nobj.CheckPrime(iValue);

        if(bRet==true)
        {
            System.out.println("it is prime");
        }
        else
        {
          System.out.println("it is not prime");  
        }

        
        
    }
}

// Time complexity: O(N/2)
// where N>=0