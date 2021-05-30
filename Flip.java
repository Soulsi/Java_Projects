import java.util.*;


public class Flip{
    public static void main(String[] args){
           int[] list = new int[20];
           System.out.println("The Array is");
           int[] t = Array1(list);
           System.out.print(Arrays.toString(t));
           System.out.println();
           int[] r = reverse(t);
           System.out.println(Arrays.toString(r));
    }
    public static int[] Array1(int[]list){
          for(int i = 0; i < list.length; i++){
               Random r = new Random();
               int t = r.nextInt(100)+1;
               list[i] = t;
                         }   
          return list; 
    }
    public static int[] reverse(int[]list){
          int [] list2 = new int[20];
         
          for (int i = 0; i <= list.length-1; i++){
               list2[i] = list[20-1-i];
                         }
          return list2;
    }
}