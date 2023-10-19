import java.util.*;
import java.lang.Math;
public class prime {
    public static void main(String[] args)
     {
        int i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter number"));
        int n = sc.nextInt();
        for(i=2;i<(n/2);++i)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
           
    }
    if(flag==0)
    {
        System.out.println("Prime");
    }
    else{
        System.out.println("Not prime");
    }
}  
}
