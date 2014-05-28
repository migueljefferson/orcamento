package br.com.orcamento.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.orcamento.jdbc.dao.FuncionarioDao;
import br.com.orcamento.modelo.Funcionario;

/**
 * Servlet implementation class FuncionarioControle
 */
// @WebServlet("/FuncionarioControle")
public class FuncionarioControle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String INSERT_OR_EDIT = "/editaFuncionario.jsp";
	private static String LIST_USER = "/listaFuncionario.jsp";
	private FuncionarioDao dao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FuncionarioControle() {
		super();
		
		dao = new FuncionarioDao(null);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String forward = "";
		String action = request.getParameter("action");

		if (action == null) {
			action = "lista";
		}

		if (action.equalsIgnoreCase("remove")) {
			int userId = Integer.parseInt(request.getParameter("Id"));
			Funcionario funcionario = new Funcionario();
			funcionario.setId(userId);
			dao.delete(funcionario);
			forward = LIST_USER;
			request.setAttribute("funcionarios", dao.getLista());
		} else if (action.equalsIgnoreCase("edita")) {
			forward = INSERT_OR_EDIT;
			Long userId = Long.parseLong(request.getParameter("Id"));
			Funcionario funcionario = dao.getById(userId);
			request.setAttribute("funcionario", funcionario);
		} else if (action.equalsIgnoreCase("lista")) {
			forward = LIST_USER;
			request.setAttribute("funcionarios", dao.getLista());
		} else {
			forward = INSERT_OR_EDIT;
		}

		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario();
		funcionario.setNome(request.getParameter("nome"));
		funcionario.setLogradouro(request.getParameter("endereco"));
		funcionario.setEmail(request.getParameter("email"));
		funcionario.setDepartamentos_id(Integer.parseInt(request
				.getParameter("departamentos_id")));
		funcionario.setSenha(request.getParameter("senha"));
		;
		String id = request.getParameter("id");
		if (id == null || id.isEmpty()) {
			dao.save(funcionario);
		} else {
			funcionario.setId(Integer.parseInt(id));
			dao.update(funcionario);
		}
		RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
		request.setAttribute("funcionarios", dao.getLista());
		view.forward(request, response);
	}

}
