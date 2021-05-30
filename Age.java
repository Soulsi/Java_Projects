import java.util.*;
public class Age {
public static void main(String[] args){
Scanner console = new Scanner(System.in);

System.out.println("How old are you? ");
int age = console.nextInt();

if (age < 16){
System.out.println("You can't drive");
}
else if (age > 16){
Scanner cat = new Scanner(System.in);

System.out.println("M or F");
char s = cat.next().charAt(0);

char m = Character.toUpperCase(s);
if (m == 'M' ){
System.out.println("You can now register for the draft");
}
else if (m == 'F'){
System.out.println("You can't register for the draft"); 
}
}
}
}