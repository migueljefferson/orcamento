package br.com.orcamento.jdbc.teste;

import br.com.orcamento.jdbc.dao.FuncionarioDao;
import br.com.orcamento.modelo.Funcionario;

public class TestaAltera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuncionarioDao dao = new FuncionarioDao();
		Funcionario contato = new Funcionario();
		contato = dao.getFuncionarioById(2);
		contato.setEmail("florencio@yahoo.com.br");
		dao.altera(contato);
		System.out.println("Alterado!");
	}

}
