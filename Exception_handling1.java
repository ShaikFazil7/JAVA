
import java.io.FileReader;
import java.io.IOException;

public class Exception_handling1
{
    static void readFile() throws IOException
    {
        FileReader text = new FileReader("Primr.java");
        System.out.println("FILE OPENED");
    }

    public static void main(String[] args) 
    {
        try {
            readFile();
        } catch (IOException e) 
        {
        System.out.println("Something Went Wrong!!!!");
        }    
    }
}