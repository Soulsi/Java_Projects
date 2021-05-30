import java.util.*;
public class Multi  {
   
        public static void main(String[] args) {
            int[][] dimension = new int[7][];
            randomnum(dimension);
            print(dimension);
   }

    public static void randomnum(int[][] dimension) {
        for (int i = 0; i < dimension.length; i++) {
            Random rand = new Random();
            dimension[i] = new int[i];
            //dimension[i][0] = rand.nextInt(5); ;
            //dimension[i][i] = rand.nextInt(6);
            for (int j = 1; j < i; j++) {
                dimension[i][j] = dimension[i -1][j-1] + dimension[i-1][j-1];
            }
        }
   }


       public static void print(int[][] dimension) {
        for (int i = 0; i < dimension.length; i++) {
            System.out.print("data " + "[" + i + "] = ");
             for (int j = 0; j < dimension[i].length; j++) {
                 System.out.print(dimension[i][j] + " ");
                }
             System.out.println();
            }
   }
}