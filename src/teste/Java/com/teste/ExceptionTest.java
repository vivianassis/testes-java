package com.teste;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;


public class ExceptionTest {

	
	@Test() 
	public void empty() { 
	     List<String> lista = new ArrayList<String>();
	     
	     lista.get(0); 
	}
	
	
	
	//@Rule
	/*public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
	    List<Object> list = new ArrayList<Object>();
	 
	    thrown.expect(IndexOutOfBoundsException.class);
	    thrown.expectMessage("Index: 0, Size: 0");
	    list.get(0); 
	}
	*/
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldThrowsIndexOutBoundsException() {
	        new ArrayList<>().get(0);
	}
	
}
