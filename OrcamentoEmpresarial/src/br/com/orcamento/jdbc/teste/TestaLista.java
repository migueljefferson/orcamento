package br.com.orcamento.jdbc.teste;

import java.util.List;

import br.com.orcamento.jdbc.dao.FuncionarioDAO;
import br.com.orcamento.modelo.Funcionario;

public class TestaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		List<Funcionario> contatos = dao.getLista();
		
		for (Funcionario contato: contatos) {
			System.out.println("Id: "+contato.getId());
			System.out.println("Nome: "+contato.getNome());
			System.out.println("Email: "+contato.getEmail());
			System.out.println("Endere�o: "+contato.getEndereco());
			System.out.println("Departamento: "+contato.getDepartamentos_id());
			System.out.println("Senha: "+contato.getSenha());
			System.out.println("\n");
		}
	}
}
