package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repositorio.Repositorio;

/**
 * Servlet implementation class visualizarTa
 */
@WebServlet("/visualizarTarefas")
public class visualizarTa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Repositorio repo = new Repositorio();
		
		int id = Integer.valueOf(request.getParameter("id"));
		
		request.setAttribute("ta", repo.TarefaId(id));
		
		request.getRequestDispatcher("listaTarefa.jsp").forward(request, response);
	}

}
