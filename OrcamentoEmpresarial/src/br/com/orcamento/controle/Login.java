package br.com.orcamento.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.orcamento.jdbc.dao.FuncionarioDAO;
import br.com.orcamento.modelo.Funcionario;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	// Mant�m a lista de usu�rios logados
	final static Map<String, Funcionario> USUARIOS_LOGADOS = new HashMap<>();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		PrintWriter writer = response.getWriter();
		Funcionario funcionario = new FuncionarioDAO()
				.getFuncionarioByEmailSenha(email, senha);
		if (funcionario.getEmail() == null) {
			writer.println("<html><body>Usu�rio Inv�lido</body><html>");
		} else {

			String codigoAleatorio = "" + System.currentTimeMillis() + "/"
					+ Math.random();
			USUARIOS_LOGADOS.put(codigoAleatorio, funcionario);

			// Criar o cookie
			Cookie cookie = new Cookie("usuario.logado", codigoAleatorio);
			// Dura��o do Cookie = 10m
			cookie.setMaxAge(10 * 60);

			// Enviar para o cliente
			response.addCookie(cookie);

			RequestDispatcher view = request
					.getRequestDispatcher("/loginOK.jsp");
			request.setAttribute("nomelogado", funcionario.getNome());
			view.forward(request, response);

		}
	}

}
