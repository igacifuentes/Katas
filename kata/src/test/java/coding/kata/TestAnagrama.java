package coding.kata;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestAnagrama {

	Boolean existe=false;
	static Anagrama an;
	static String palabra="roma";
	
	@BeforeClass
	public static void setUpClass(){
		// Arrange
		an=new Anagrama();
		an.llenarAnagramas(palabra);
	}
	@Test
	public void probarPalabraRamo() {
		// Act
		
		String anagrama="ramo";
		existe=an.buscar_Palabra(anagrama);
	
		// Assert 
		assertEquals("El anagrama deberia devolver verdadero",true,existe);
		assertNotNull(existe);
	}
	
	@Test
	public void probarPalabraAmor(){
		String anagrama="amor";
		existe=an.buscar_Palabra(anagrama);
		
		assertEquals("El anagrama deberia dovolver verdadero ",true,existe);
		
	}	
	@Test
	public void probarPalabraOmar(){
		String anagrama="omar";
		existe=an.buscar_Palabra(anagrama);
		
		assertEquals("El anagrama deberia dovolver verdadero ",true,existe);
	}
	
	@Test
	public void probarPalabraMora(){
		String anagrama="mora";
		existe=an.buscar_Palabra(anagrama);
		
		assertEquals("El anagrama deberia dovolver verdadero ",true,existe);
	}
	
	@Test
	public void probarPalabraArmo(){
		String anagrama="armo";
		existe=an.buscar_Palabra(anagrama);
		
		assertEquals("El anagrama deberia dovolver verdadero ",true,existe);
	}
	
	@Test
	public void probarPalabraMaro(){
		String anagrama="armo";
		existe=an.buscar_Palabra(anagrama);
		
		assertEquals("El anagrama deberia dovolver verdadero ",true,existe);
	}
	
	@Test
	public void probarPalabraMoor(){
		String anagrama="moor";
		existe=an.buscar_Palabra(anagrama);
		
		assertEquals("El anagrama deberia dovolver false ",false,existe);
	}
	
	@Test
	public void probarPalabraRomo(){
		String anagrama="romo";
		existe=an.buscar_Palabra(anagrama);
		
		assertEquals("El anagrama deberia dovolver false ",false,existe);
	}
	

}
