import java.util.*;
public class hashSet {
   public static void main(String[] args) {
    LinkedHashSet<Integer>hs=new LinkedHashSet<>();
    hs.add(1);
    hs.add(2);
    hs.add(3);
    hs.add(4);
    hs.add(5);
    System.out.println("Set = "+hs);
    hs.remove(5);
    System.out.println("Set = "+hs);
    int x=hs.size();
    System.out.println("Size of set object = "+x);
    hs.remove(2);
    System.out.println("Set ="+hs);
   } 
}
