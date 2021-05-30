import java.io.*;
public class FileOutput{
public static void main(String[] args)throws FileNotFoundException{
PrintStream output = new PrintStream(new File("All About Me.txt"));

output.println("Jesus Castaneda");
output.println("My favorite color is green");
output.println("I enjoy reading, sleeping, and eating");
}
}