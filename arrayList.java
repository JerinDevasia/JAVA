import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String>obj=new ArrayList<String>();
        obj.add("alpha");
        obj.add("beta");
        obj.add("gamma");
        obj.add("phi");
        System.out.println("Original Arraylist");
        for(String str:obj)
        { 
            System.out.println(str);
        }
        obj.add(1,"Hamiltonian");
        System.out.println("Arraylist after modification");
        for(String str:obj)
        {
            System.out.println(str);
        }
        System.out.println("Arraylist after remove operation");
        obj.remove("Hamiltonian");
        for(String str:obj)
        {
            System.out.println(str);
        }
        Collections.sort(obj);
        System.out.println("Arraylist after sorting");
        for(String str:obj)
        {
            System.out.println(str);
        }
        System.out.println("Object at index 2 : "+obj.get(2));
        System.out.println("Six is in arraylit : "+obj.contains("beta"));
        System.out.println("Size of the arraylist : "+obj.size());
        obj.clear();
    }
}
