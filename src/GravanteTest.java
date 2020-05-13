import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GravanteTest {

	@Test
	void testMetodo1() {
		GravanteClass g= new GravanteClass();
		double risultatoO= g.GravanteMet(3, 7);
		double risultatoA= 2187;
		assertEquals(risultatoA, risultatoO );
	}
	
	@Test
	void testMetodo2() {
		GravanteClass g= new GravanteClass();
		double risultatoO= g.GravanteMet(0, 1);
		double risultatoA= 0;
		assertEquals(risultatoA, risultatoO );
	}
	
	@Test
	void testMetodo3() {
		GravanteClass g= new GravanteClass();
		double risultatoO= g.GravanteMet(0, 0);
		double risultatoA= 1;
		assertEquals(risultatoA, risultatoO );
	}
}
