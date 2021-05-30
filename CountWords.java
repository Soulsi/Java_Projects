
import java.io.*;
import java.util.*;
public class CountWords{
public static void main(String[] args)throws FileNotFoundException{
Scanner input = new Scanner(new File("hamlet.txt"));
int count = 0;
int countand =0;

while (input.hasNext()){
String word = input.next();
count++;
if (word.toLowerCase().equals("and")){
countand++;
}

}
System.out.println("total words = " + count);
}
}