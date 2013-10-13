package gianci15.PokerKata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRepartirCartas {

	RepartirCartas repartir;
	
	@Before
	public void before(){
		
		// Arrange
		repartir=new RepartirCartas();
				
	}
	@Test
	public void testValoresCartas() {
		
		//Act
		repartir.repartirMano("21","22","23","24");
		// Assert
		assertEquals("La mano deberia ser : 2T 2P 2D 2C","2T 2P 2D 2C",repartir.verMano());
		
		//Act
		repartir.repartirMano("41","52","93","24");
		// Assert
		assertEquals("La mano deberia ser : 4T 5P 9D 2C","4T 5P 9D 2C",repartir.verMano());
		
		//Act
		repartir.repartirMano("92","71","53","61");
		// Assert
		assertEquals("La mano deberia ser : 9P 7T 5D 6T","9P 7T 5D 6T",repartir.verMano());
	}
	
	@Test
	public void TestValoresCartasLetras(){
		
		//Act
		repartir.repartirMano("111","122","133","14");
		//Assert
		assertEquals("La mano deberia ser : JT QP KD AC","JT QP KD AC",repartir.verMano());
		
		//Act
		repartir.repartirMano("122","11","103","134");
		//Assert
		assertEquals("La mano deberia ser : QP AT 10D KC","QP AT 10D KC",repartir.verMano());
	}

	
}
