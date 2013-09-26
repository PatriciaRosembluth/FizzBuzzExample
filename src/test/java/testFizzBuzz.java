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
	
	@Test
	public void ImprimirBuzzPara5()
	{
		assertEquals("Buzz",fb.Generar(5));
	}
	
	@Test
	public void ImprimirBuzzParaMultiplosDe5()
	{
		assertEquals("Buzz",fb.Generar(25));
	}
	
	@Test
	public void ImprimirFizzBuzzParaMultiplosDe3y5()
	{
		assertEquals("FizzBuzz",fb.Generar(15));
	}
	
	@Test
	public void ImprimirElMismoNumeroSiNoEsMultiploDe3Ni5()
	{
		assertEquals("8",fb.Generar(8));
	}

	@Test
	public void ImprimirListaDeNumeros()
	{
		String lista="1\n"+"2\n"+"Fizz\n"+"4\n"+"Buzz\n";
		assertEquals(lista,fb.Imprimir(5));
	}
}
