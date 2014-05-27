package br.com.orcamento.controle;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.orcamento.modelo.Funcionario;

@WebFilter(urlPatterns = "/FuncionarioControle")
public class FiltroDeAuditoria implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String uri = req.getRequestURI();
		String usuario = getUsuario(req);	
		
		Funcionario funcionario = Login.USUARIOS_LOGADOS.get(usuario);
		
		if (funcionario==null) {
			 resp.sendRedirect("/index.jsp");
		}
		
		System.out.println("Usuário " + usuario + " acessando a URI "+uri);
		chain.doFilter(request, response);
	}

	private String getUsuario(HttpServletRequest req) {
		Cookie cookie = new Cookies(req.getCookies()).
				buscaUsuarioLogado();
		if (cookie==null) return "<deslogado>";
		return cookie.getValue();
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
