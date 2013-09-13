package coding.kata;


import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
* Unit test for simple App.
*/
public class TestAnagrama extends TestCase
{
    /**
* Create the test case
*
* @param testName name of the test case
*/
	Anagrama an;
	String palabra="roma";
	
    public TestAnagrama( String testName )
    {
        super( testName );
        an=new Anagrama();
    	an.llenarAnagramas(palabra);
    }
 
    /**
* @return the suite of tests being tested
*/
    public static Test suite()
    {
        return new TestSuite( TestAnagrama.class );
    }

    /**
* Rigourous Test :-)
*/
  

    public void testPalabraRamo()
    {

    String anagrama="ramo";
	boolean existe=an.buscar_Palabra(anagrama);
	
    Assert.assertEquals("El anagrama deberia devolver verdadero",true,existe);
       
       
    }

    
	public void testPalabraAmor(){
		String anagrama="amor";
		boolean existe=an.buscar_Palabra(anagrama);
		
	    Assert.assertEquals("El anagrama deberia devolver verdadero",true,existe);
	}
	

	public void testPalabraOmar(){
		String anagrama="omar";
		boolean existe=an.buscar_Palabra(anagrama);
		
	    Assert.assertEquals("El anagrama deberia devolver verdadero",true,existe);
	}
	

	public void testPalabraMora(){
		String anagrama="mora";
		boolean existe=an.buscar_Palabra(anagrama);
		
	    Assert.assertEquals("El anagrama deberia devolver verdadero",true,existe);
	}
	

	public void testPalabraArmo(){
		String anagrama="armo";
		boolean existe=an.buscar_Palabra(anagrama);
		
	    Assert.assertEquals("El anagrama deberia devolver verdadero",true,existe);
	}
	
	
	public void testPalabraMaro(){
		String anagrama="armo";
		boolean existe=an.buscar_Palabra(anagrama);
		
	    Assert.assertEquals("El anagrama deberia devolver verdadero",true,existe);
	}
	
	
	public void testPalabraMoor(){
		String anagrama="moor";
		boolean existe=an.buscar_Palabra(anagrama);
		
	    Assert.assertEquals("El anagrama deberia devolver verdadero",false,existe);
	}
	

	public void testPalabraRomo(){
		String anagrama="romo";
		boolean existe=an.buscar_Palabra(anagrama);
		
	    Assert.assertEquals("El anagrama deberia devolver verdadero",false,existe);
	}
    

 }