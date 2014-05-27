package br.com.orcamento.jdbc.teste;

import br.com.orcamento.jdbc.dao.FuncionarioDAO;
import br.com.orcamento.modelo.Funcionario;

public class TestaAltera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuncionarioDAO dao = new FuncionarioDAO();
		Funcionario contato = new Funcionario();
		contato = dao.getFuncionarioById(2);
		contato.setEmail("florencio@yahoo.com.br");
		dao.altera(contato);
		System.out.println("Alterado!");
	}

}
