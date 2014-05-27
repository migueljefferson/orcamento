package br.com.orcamento.jdbc.teste;

import br.com.orcamento.jdbc.dao.FuncionarioDAO;
import br.com.orcamento.modelo.Funcionario;

public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario contato = new Funcionario();
		
		contato.setNome("Florencio");
		contato.setEmail("florencioq@gmail.com");
		contato.setEndereco("Rua Paula Ney, 700");
		contato.setDepartamentos_id(0);
		contato.setSenha("123");
		
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.adiciona(contato);
		
		System.out.println("Gravado!");

	}

}
