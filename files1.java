import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.*;
import java.util.*;
public class files1 {
    public static void main(String[] args) {
        try
        {
            FileWriter writer=new FileWriter("file1.txt",true);
            writer.write("New file is created");
            writer.close();
            FileReader reader=new FileReader("file1.txt");
            BufferedReader br=new BufferedReader(reader);
            String line;
            System.out.println("Data read from the table");
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            reader.close();
        }
        catch(IOException e)
        {
            System.out.println("Error" );
        }
    }
}
