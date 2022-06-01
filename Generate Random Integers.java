import java.util.*;
public class Main {
	 
public static void main(String[] args) {
		int n ;
		 System.out.println("Enter the integer: ");
		 
	        Scanner s = new Scanner(System.in);
	  
	        n = s.nextInt();  
int[] array=new int[n] ;

	    System.out.println("Random Array Elements:");
	   
	    for (int i = 0; i < n; i ++) {

	      array[i] = (int)(Math.random()*100 );
	    }
}
}
