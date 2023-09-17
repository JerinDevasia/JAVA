import java.util.*;
class negative extends Exception
{
    negative(String msg)
    {
        System.out.println(msg);
    }
}

public class negex
{
    public static void main(String[] args) 
    {
        int i,s=0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for(i=0;i<n;++i)
        {
            try{
                arr[i]=sc.nextInt();
                if(arr[i]<0)
                {
                    throw new negative("No negative number");
                }
                else
                {
                    s+=arr[i];
                }

            }
            catch(Exception e)
            {
                System.out.println("Enter another number");
                --i;
            }

        }
        System.out.println("Average : "+s/n);
    }
}