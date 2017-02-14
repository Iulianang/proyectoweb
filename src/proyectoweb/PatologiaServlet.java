package proyectoweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.PatologiaDTO;

/**
 * Servlet implementation class PatologiaServlet
 */
@WebServlet("/PatologiaServlet")
public class PatologiaServlet extends HttpServlet {
	private PatologiaService service_patologia;
	private PatologiaDTO patologia;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PatologiaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();

		String valorid = request.getParameter("id");
		int id = Integer.valueOf(valorid);

//		patologia = service_patologia.obtenerPatologiaPorID(id);
//
//		pw.write("Nombre: " + patologia.getNombre_patologia() + "<br><br>Causa: " + patologia.getCausa_patologia()
//				+ "<br><br>Descripcion " + patologia.getDescripcion_patologia() + "<br><br>Tratamiento: "
//				+ patologia.getTratamiento_patologia());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
