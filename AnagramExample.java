package ForPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

// Listen and Silent
public class AnagramExample {
public static void main(String[] args) {
	    String stg = "Listen";
	    String stg2 = "Silent";
	    		
	   if (isAnagram(stg,stg2)) {
		   
		   System.out.println("isanagram");
	   }
	   else {
		   System.out.println("notanagram");
	   }
}

public static boolean isAnagram(String stg, String stg2) {
        stg = stg.replaceAll("\\s", "").toLowerCase();
        stg2 = stg2.replaceAll("\\s", "").toLowerCase();

           if (stg.length()!=(stg2.length())) 
           {
        	   return false;
        	   
           }
        
          char [] arr = stg.toCharArray();
          char [] arr2 = stg2.toCharArray();
          
          
          Arrays.sort(arr);
          Arrays.sort(arr2);
          
          
          return Arrays.equals(arr, arr2); 
}

}




	


