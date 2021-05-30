import java.util.*;
public class AverageWeight{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int [] weight = new int[5];
        int sum = 0;
        
        
        for (int i = 1; i <weight.length ; i++){
            System.out.print("Type in your weight");
            weight [i] =console.nextInt();
            sum+= weight [i];
        
        
    }
    int average = sum/weight.length;
    System.out.println("The average weight is =" + average);
}
}