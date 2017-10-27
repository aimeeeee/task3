package IT7320.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		palindromic obj = new palindromic();
		
		System.out.println("A - Find palindromic number "); 
		System.out.println("B - Check if the number or word is palindromic "); 
	    char c = input.next().charAt(0);
	    input.nextLine();
	    
	    if (c == 'a' || c == 'A') {
	    	
	    	System.out.println("please input a number between 10-100000: "); 
	    	int n = input.nextInt();
	    	input.nextLine();
	    	
	    	ArrayList al = new ArrayList();
	    al = obj.findPalindromic(n);
	    System.out.println("There are "+ al.size() + " palindromic number, ther are: ");
	    	System.out.println(al);
	    }
	    
	    else if(c == 'b' || c =='B') {
        System.out.println("please input a word or number:  "); 
        String a = input.nextLine();
        
        
        String b = obj.removeSpace(a);
        boolean result = obj.compare(b);
        
        if (result) {
        	System.out.println(a+" is palindromic");
        }
        else {
        	System.out.println(a+" is not palindromic");
        }
	  }
	}
}
