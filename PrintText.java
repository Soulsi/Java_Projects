import java.io.*;
 public class PrintText {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("hello.txt"));
        output.println("Hello, world.");
        output.println();
        output.println("This program produces four");
        output.println("lines of output.");
 } 
}