import java.util.*;
 

public class Main {

public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
System.out.println("Enter s1: ");
String str1= sc.nextLine();
System.out.println("lowercase: "+str1);
System.out.println("uppercase: "+str1.toUpperCase());
System.out.println("replace: "+str1.replace(' ', ':') );
System.out.println("Enter s2: ");
String str2= sc.nextLine();
           //Are the two strings identical? -------------
         if(str2.equals(str1)) {
        System.out.println("The two strings are identical");
}
         else System.out.println("The two strings are different");
         //Do both strings start with the same character? ----------
          if(str1.charAt(0)==str2.charAt(0))
        System.out.println("The two strings start with the same character");
          else
        System.out.println("The two strings do not start with the same character");
         // does s1 start with s2? --------------------
          if(str1.startsWith(str2))
        System.out.println("s1 starts with s2");
        
          else
        System.out.println("s1 does not start with s2");
          // does s1 end with s2? -----------------------
          if(str1.endsWith(str2))
      System.out.println("s1 ends with s2");
      
        else
      System.out.println("s1 does not end with s2");
          // does s1 contain s2? --------------------------
          if(str1.contains(str2)) {
        System.out.println("s1 contains s2");
        // display the private string s1 of s2
        str1=str1.replace(str2,"");
        System.out.println("s1 without s2: "+str1);
          }
          else
        System.out.println("s1 does not contain s2");
          
          
}
}
