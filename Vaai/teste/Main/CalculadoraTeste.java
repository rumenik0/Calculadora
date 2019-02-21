package Main;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;



public class CalculadoraTeste {

	@Test
	public void testeSoma() {
		try {
			Calculadora c = new Calculadora();
		
			Double n1,n2, result;
			n1 = 3.0;
			n2 = 3.0;
			result = c.soma(n1,n2);
			assertEquals(6.0,result,0);
			
			assertEquals(0,0,0);
			
		}catch(Exception e){
			
		}
	}
	
	@Test
	public void testeSubtrai() {
		try {
			Calculadora c = new Calculadora();
		
			Double n1,n2, result;
			n1 = 3.0;
			n2 = 3.0;
			result = c.subtrai(n1,n2);
			assertEquals(0,result,0);

		}catch(Exception e){
			
		}
	}
	
	@Test
	public void testeDivide() {
		try {
			Calculadora c = new Calculadora();
		
			Double n1,n2, result;
			n1 = 3.0;
			n2 = 3.0;
			result = c.divide(n1,n2);
			assertEquals(1,result,0);

		}catch(Exception e){
			
		}
	}

	@Test
	public void testeMultiplica() {
		try {
			Calculadora c = new Calculadora();
		
			Double n1,n2, result;
			n1 = 3.0;
			n2 = 3.0;
			result = c.multiplica(n1,n2);
			assertEquals(9.0,result,0);

		}catch(Exception e){
			
		}
	}
}
