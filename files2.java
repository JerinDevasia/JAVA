import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.io.IOException;
public class files2 {
    public static void main(String[] args) throws IOException
    {
        FileInputStream source=new FileInputStream("file1.txt");
        FileOutputStream dest_odd=new FileOutputStream("odd.txt");
        FileOutputStream dest_even=new FileOutputStream("eve.txt");
        int i;
        while((i=source.read())!=-1)
        {
            if(i%2==0)
            {
                dest_even.write(i);
            }
            else{
                dest_odd.write(i);
            }
        }
        System.out.println("Copied");
        source.close();
        dest_even.close();
        dest_odd.close();
    }
}
