import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int forward = 0;
	
	
	public static void main(String[] args) throws IOException {
	    System.out.println("Key \"WESD\" To Move");
	    System.out.println("Key \"J\" To Attack");
	    
	    while (true) {
	    	
	    	Scanner key = new Scanner(System.in);
	        String key_test = key.nextLine();
	        System.out.print("\nPlease Enter Key ");
	        if (key_test.equals("W") || key_test.equals("w")) {
	        	System.out.print("You forward ");
	        	forward = forward + 1;
	        	}
	        if (key_test.equals("A") || key_test.equals("a")) {
	        	System.out.print("You Turn Left ");
	        	}
	        if (key_test.equals("D") || key_test.equals("d")) {
	        	System.out.print("You Turn Right ");		        	
	        	}
	        if (key_test.equals("S") || key_test.equals("s")) {
	        	System.out.print("You Rearward ");		        	
	        	}
	        if (key_test.equals("J") || key_test.equals("j")) {
	        	System.out.print("You Attack ...()=w=) ");		        	
	        	}
	        
	        
	        
	        if (forward == 3) {
	        	System.out.print("\nYou found monster [Slime]");
	        }
	        
	          
	      }  
	  }
}

