import java.util.*;  
 
public class Main  {

	public static void main(String[] args) {
  
		        ArrayList<Character> s1=new ArrayList<>() ;
		     for (int i = 0; i < 15; i++) {
		    	 char c=(char)(((Math.random()*100)%26)+65) ;
				s1.add(c) ;
			}
		       
			for (char string : s1) {
				System.out.print(string+" ");
			}
