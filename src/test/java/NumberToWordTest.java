import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberToWordTest {
	@Test
	 public void testNumberToWord(){  
		NumberWords nw = new NumberWords();
		 assertEquals("One",nw.toWords(1));  
		 assertEquals("Ten",nw.toWords(10)); 
		 assertEquals("One Lakh",nw.toWords(100000)); 
		 assertEquals("Nine Thousand Eight Hundred Ninety Eight",nw.toWords(9898));
		 assertEquals("Minus Nine",nw.toWords(-9));  
	      
	        
	    }  
}
