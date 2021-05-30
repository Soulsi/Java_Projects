import java.util.*;
public class MidTerm{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        System.out.print("What is the first store name?");
        String firststore = console.nextLine().toUpperCase();
        System.out.print("what is the second store name?");
        String secondstore = console.nextLine().toUpperCase();
        
        System.out.println(firststore + " vs " + secondstore);
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the daily sales for " + firststore + ":");
        double average1 = 0.0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Day " + i + "? ");
            double next = console.nextDouble();
            average1 += next;
        }
        System.out.println("Enter the daily sales for " + secondstore + ":");
        double average2 = 0.0;
        for (int k = 1; k <= 5; k++) {
            System.out.print("Day " + k + "? ");
            double next = console.nextDouble();
            average2 += next;
            
        }
        
        double x = average1/5;
        double y = average2/5;
        System.out.println();
        System.out.println("The average sales for " + firststore + " is " + x);
        System.out.println("The average sales for " + secondstore + " is " + y);
        
        System.out.print(firststore + ":");
        for (int j = 1; j <= x/100; j++){
            System.out.print('*');
        }
        
        System.out.println();
        System.out.print(secondstore + ":");
        for (int p = 1; p <= x/100; p++){
            System.out.print('*');
        }
        System.out.println();
        
        if (Math.min(x, y)/Math.max(x,y)<=.1){
            System.out.print(Math.max(x,y) + " is beating them");
        }
        else if (Math.min(x, y)/Math.max(x,y)<=.20){
            System.out.print(Math.max(x,y) + " is trouncing them");
        }
        else if (Math.min(x, y)/Math.max(x,y)<=.30){
            System.out.print(Math.max(x,y) + " is annihilating them");
        }
        else if (Math.min(x, y)/Math.max(x,y)>=.1){
            System.out.print("They are neck and neck ");
        }
        
    }
        
}

        