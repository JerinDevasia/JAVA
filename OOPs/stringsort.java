import java.util.*;
class stringsort
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of strings");
        int n = sc.nextInt();
        String[] str = new String[n+1];
        System.out.println("Enter strings");
        for(i=0;i<=n;++i)
        {
            str[i]=sc.nextLine();
        }
        for(i=0;i<n;++i)
        {
            for(j=i+1;j<n;++j)
            {
                String temp;
                if(str[i].compareTo(str[j])>0)
                {
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("Strings in sorted order");
        for(i=0;i<=n;++i)
        {
            System.out.print(str[i]);
        }
    }
}

