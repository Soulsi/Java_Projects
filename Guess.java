//Group 
//Jesus Castaneda
//Jorge Delgado
//Guadalupe Velazco

import java.util.*;
import java.io.*;

public class Guess {

	public static Scanner console = new Scanner(System.in);		
	public static void main(String[] args) {		
	    String answer = "";
	    int count = 0;
		Scanner console = new Scanner(System.in);
		Random r = new Random();
		
		
		do {
			int guess = r.nextInt(20)+1;
		    System.out.print("Is it " + guess + "? (y/n)");
			answer = console.next();
			System.out.println();
			count++;
			if (answer.startsWith("Y") || answer.startsWith("y")) {
			    System.out.print("I got your number of " + guess + " correct in " + count + " guesses.");
			    
			}else if (answer.startsWith("N") || answer.startsWith("n")) {
				
			}
		}while (answer.startsWith("N") || answer.startsWith("n"));
		
	}
	
	
	
	}
