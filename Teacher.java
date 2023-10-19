import java.util.*;
class Employee
{
    int id;
    String name;
    int salary;
    String address;
    Employee(int id,String name,int salary,String address)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
}
public class Teacher extends Employee{
    String dept;
    String subject;
    Teacher(int id,String name,int salary,String address,String dept,String sub)
    {
        super(id,name,salary,address);
        this.dept=dept;
        this.subject=sub;
    }
    void display()
    {
    System.out.println("Employee id: "+id);
    System.out.println("Name: "+name);
    System.out.println("Salary: "+salary);
    System.out.println("Address: "+address);
    System.out.println("Department: "+dept);
    System.out.println("Subject: "+subject);
    }
    public static void main(String[] args) {
        int i;
        System.out.println("Enter number of employees");
        Scanner sc1=new Scanner(System.in);
        int n=sc1.nextInt();
        Teacher arr[]=new Teacher[n];
        for(i=0;i<n;++i)
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("\nEnter Employee id: ");
            int id=sc.nextInt();
            System.out.println("\nEnter Employee Name: ");
            String name=sc.next();
            System.out.println("\nEnter Salary: ");
            int salary=sc.nextInt();
            System.out.println("\nEnter Address: ");
            String address=sc.next();
            System.out.println("\nEnter department: ");
            String dept=sc.next();
            System.out.println("\nEnter Subject: ");
            String sub=sc.next();
            arr[i]=new Teacher(id,name,salary,address,dept,sub);
        }
        System.out.println("\n********Informations of all the employee's************");
        for(i=0;i<n;i++){
            int j=i+1;
            System.out.println("\n"+j+").");
            arr[i].display();
            
        }
        sc1.close();
    }
}