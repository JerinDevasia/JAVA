package exam.operations;

public class sub implements calculate {
    @Override
    public void calc(int a,int b)
    {
        int c=a-b;
        System.out.println("Subtraction : "+c);
    }
    
}