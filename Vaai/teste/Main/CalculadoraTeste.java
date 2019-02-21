package Main;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;



public class CalculadoraTeste {

	@Test
	public void testeSomar() {
		try {
			Calculadora c = new Calculadora();
		
			String n1,n2;
			Double result;
			n1 = "3";
			n2 = "3";
			result = c.somar(n1,n2);
			assertEquals(6.0,result,0);
			
		}catch(Exception e){
			
		}
	}
	
	@Test
	public void testeDividir() {
		try {
			Calculadora c = new Calculadora();
		
			String n1,n2;
			Double result;
			n1 = "3";
			n2 = "3";
			result = c.dividir(n1,n2);
			assertEquals(1,result,0);

		}catch(Exception e){
			
		}
	}
	
	@Test
	public void testeRaizQuadrada() {
		try {
			Calculadora c = new Calculadora();
			String n1;
			Double result;
			n1 = "3";
			result = c.raizQuadrada(n1);
			assertEquals(9.0,result,0);

		}catch(Exception e){
			
		}
	}

}
