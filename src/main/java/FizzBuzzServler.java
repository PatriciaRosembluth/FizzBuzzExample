import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FizzBuzzServler extends HttpServlet 
{	
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		    String numeros = request.getParameter("numeros");
			FizzBuzz fb = new FizzBuzz();
			response.getWriter().println(fb.Imprimir(Integer.parseInt(numeros)));
}
