package exam;
import java.util.*;
import exam.operations.*;
// import exam.operations.sub;
// import exam.operations.calculate;
public class driver
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        add ob1 = new add();
        sub ob2 = new sub();
        ob1.calc(a,b);
        ob2.calc(a,b);
    }
}
