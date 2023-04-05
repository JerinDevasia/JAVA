import java.util.*;
public class ArraySearch
{
 public static void main(String[] args)
 {
  int i,j;
  Scanner sc= new Scanner(System.in);    
  System.out.print("Enter size of array ");  
  int size= sc.nextInt();  

  int[] arr = new int[10];
  System.out.println("Enter"+" " + size + " " + "elements into the array ");
  for(i=0;i<size;++i)
  {
  arr[i] = sc.nextInt();
  } 
 
  System.out.println("Enter element to search ");
  int element = sc.nextInt();

   int s = 0;
   for(i=0;i<=size;++i)
   {
     if(arr[i] == element)
     {

       s=1;
       break;
     }
    
   }


  if(s ==1)
  {
    System.out.println("Element found at position "+i);
  }
  else
  {

    System.out.println("Element not found");
  }
 }
}
