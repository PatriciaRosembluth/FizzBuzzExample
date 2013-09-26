
public class FizzBuzz 
{
	private static final int _Fizz=3;
	private static final int _Buzz=5;
	private static final String _MensajeFizz="Fizz";
	private static final String _MensajeBuzz="Buzz";
	private static final String _MensajeFizzBuzz="FizzBuzz";
	public String Generar(int numero) 
	{
		if(EsMultiplo(numero,_Fizz) && EsMultiplo(numero,_Buzz) )
			return _MensajeFizzBuzz;
		if (EsMultiplo(numero, _Fizz))
			return _MensajeFizz;
		if(EsMultiplo(numero, _Buzz))
			return _MensajeBuzz;
		return Integer.toString(numero);
	}

	public boolean EsMultiplo(int numero,int multiplo)
	{
		if(numero % multiplo == 0)
			return true;
		else
			return false;
	}
	
	public String Imprimir(int tam)
	{
		String resultado="";
		for(int i=1;i<=tam;i++)
		{
			resultado=resultado+Generar(i)+"\n";
		}
		return resultado;
	}
}
