import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class TestPrueba {

	@Test
	public void test() {
		
		Prueba pu=new Prueba();
		String resultado=pu.probarMetodo();
		Assert.assertEquals("El resultado deberia ser : exito","Exito",resultado);
		
	}

}
