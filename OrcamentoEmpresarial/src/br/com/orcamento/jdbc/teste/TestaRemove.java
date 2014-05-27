package br.com.orcamento.jdbc.teste;

import br.com.orcamento.jdbc.dao.FuncionarioDAO;
import br.com.orcamento.modelo.Funcionario;

public class TestaRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuncionarioDAO dao = new FuncionarioDAO();
		Funcionario contato = new Funcionario();
		contato.setId((int) 10);
		dao.remove(contato);
		System.out.println("Removido!");

	}

}
