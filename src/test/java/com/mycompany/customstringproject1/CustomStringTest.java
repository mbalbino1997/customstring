
package com.mycompany.customstringproject1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maxy1
 */
public class CustomStringTest {
    
    
	CustomString myCustomString;

	@BeforeEach
	public void setUp() throws Exception {
		
		this.myCustomString = new CustomString();
	}

	@Test
	void testGetString() {
		
		
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("hello");
		assertEquals("hello", this.myCustomString.getString());
                
                this.myCustomString.setString("");
		assertEquals("", this.myCustomString.getString());
		
                assertNotNull(this.myCustomString.getString());
                
                this.myCustomString.setString("hi");
                assertNotEquals("ho",this.myCustomString.getString());
                
		
	}               
	
	@Test
	void testSetString() {                                                              
		
		
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("Good-bye!");
		assertEquals("Good-bye!", this.myCustomString.getString());
                
                this.myCustomString.setString("");
		assertEquals("", this.myCustomString.getString());
		
                assertNotNull(this.myCustomString.getString());
                
                this.myCustomString.setString("hi");
                assertNotEquals("ho",this.myCustomString.getString());
		
		 
	}
	
	@Test
	void testRemove() {
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));
                
                this.myCustomString.setString("nabi la squikka");
		assertEquals("i l squikk", this.myCustomString.remove("abn"));
                this.myCustomString.setString("666");
		assertEquals("666", this.myCustomString.remove("666"));
                this.myCustomString.setString("abc");
		assertEquals("", this.myCustomString.remove("abc"));
		
		
	}

	@Test
	void testReverse() {

            
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
                
                this.myCustomString.setString("aBC, xyz; 123.");
		assertEquals("abc, XYZ; 123.", this.myCustomString.reverse("bcdxyz@3210."));
                this.myCustomString.setString("nAbI");
		assertEquals("NaBi", this.myCustomString.reverse("NABI"));
                this.myCustomString.setString("nabinabi");
		assertEquals("NABINABI", this.myCustomString.reverse("NABI"));
		
		
	}

	@Test
	void testFilterLetters() {
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.filterLetters('E', false));
                
                this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.filterLetters('E', true));
                this.myCustomString.setString("Abcdef");
		assertEquals("Abcd", this.myCustomString.filterLetters('e', false));
                this.myCustomString.setString("ab");
		assertEquals("b", this.myCustomString.filterLetters('a', true));
                
		
		
	}
    
}
