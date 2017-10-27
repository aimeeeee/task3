package IT7320.task3;

import java.util.ArrayList;

public class palindromic {
	
		public String removeSpace(String a) {
		
			String b = a.replace(" ", "");
			return b;
	}
 
		
		public boolean compare(String a) {
			int l = a.length();
			String b = "";
			for (int i = l-1; i >= 0; i--) {
				b += a.charAt(i);
			}
			
			boolean r;
			r = a.equals(b);
			return r;
		}
		
		public ArrayList findPalindromic(int num) {
			ArrayList al = new ArrayList();
			
			for(int i = 10; i < num; i++) {
				String s = String.valueOf(i);
				boolean r = this.compare(s);
			
				if(r) {
					al.add(s);
				   }
		        }		
			
			return al;
		}
}
