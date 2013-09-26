import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class testFizzBuzz 
{
	FizzBuzz fb;
	@Before
	public void setUp()
	{
		fb=new FizzBuzz();
	}
	@Test
	public void ImprimirFizzParaNumero3() 
	{
	   assertEquals("Fizz",fb.Generar(3));
	}
	
	@Test
	public void ImprimirFizzParaMultiplosDe3()
	{
		assertEquals("Fizz",fb.Generar(9));
	}

}
