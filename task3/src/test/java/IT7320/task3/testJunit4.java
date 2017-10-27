package IT7320.task3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testJunit4 {
	palindromic obj;
	String a;
	String b;
	int c;
	ArrayList al = new ArrayList();

	@Before
	public void setUp() throws Exception {
		obj = new palindromic();
		a = "abc ba";
		b = "abcba";
		c = 30;
		al.add("11");
		al.add("22");
		
	}
	
	@Test
    public void testFindPalindromic() {
		
		assertEquals(al, obj.findPalindromic(c));
		
	}

	@Test
	public void testRemoveSpace() {
		
		assertEquals("abcba" , obj.removeSpace(a));
		
	}
	@Test
     public void testcompare() {
		
		assertEquals(false , obj.compare(a));
		assertEquals(true , obj.compare(b));
		
	}
	

	
	@After
	public void tearDown() throws Exception {
		a = null;
		b = null;
	}

}
