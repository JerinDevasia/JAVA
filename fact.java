import java.util.*;
public class fact{  
    public static void main(String args[]){  
     int i,fact=1;  
     int n;
     Scanner sc= new Scanner(System.in);   
     System.out.print("Enter number :  ");  
     n = sc.nextInt();
     for(i=1;i<=n;i++){    
         fact=fact*i;    
     }    
     System.out.println("Factorial of "+n+" is: "+fact);    
    }  
   }  