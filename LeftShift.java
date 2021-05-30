import java.util.*;
public class LeftShift{
    public static void main(String[] args){
       int[] a = new int[10];
       a[0] = 1;
       a[1] = 1;
       a[2] = 1;
       System.out.println(Arrays.toString(a));
       leftshiftlogical(a);
       
        System.out.print(Arrays.toString(a));
    }
    public static void leftshiftlogical(int [] a){
        for (int i = 0; i< a.length - 1; i++){
            a[i] = a[i +1];
        }
        
    }
}