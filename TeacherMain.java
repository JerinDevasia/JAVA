import java.util.Scanner;

class Employee {
    int empid;
    String name, address,sub;
    double salary;

    Employee(int empid, String name, String address, double salary){
        this.empid = empid;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

}

class Teacher extends Employee {
    String dept, subject;

    Teacher(int empid, String name, String address, double salary, String dept, String sub){
        super(empid, name, address, salary);
        this.dept = dept;
        this.sub =  sub;
    }

    public void display(){
        System.out.println("Empid : " + empid);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + dept);
        System.out.println("Subject : " + sub);

    
    }
}

class TeacherMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of teachers : ");
        int n = s.nextInt();
        Teacher[] ob = new Teacher[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter empid : ");
            int empid = s.nextInt();
            System.out.println("Enter name : ");
            String name = sc.nextLine();
            System.out.println("Enter address : ");
            String address = sc.nextLine();
            System.out.println("Enter Salary : ");
            double salary = s.nextInt();
            System.out.println("Enter Department : ");
            String dept = sc.nextLine();
            System.out.println("Enter subject : ");
            String sub = sc.nextLine();

            ob[i] = new Teacher(empid, name, address, salary, dept, sub);

        }
        for(int i=0;i<n; i++){
            ob[i].display();
        }
    }
}