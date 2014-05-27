// Bean para o funcionário

package br.com.orcamento.modelo;

public class Funcionario {
	private int id;
	private String nome;
	private String email;
	private String endereco;
	private int departamentos_id;
	private String senha;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getDepartamentos_id() {
		return departamentos_id;
	}

	public void setDepartamentos_id(int departamentos_id) {
		this.departamentos_id = departamentos_id;
	}

	public void setDepartamentos_id(String departamentos_id) {
		// TODO Auto-generated method stub
		this.departamentos_id = Integer.parseInt(departamentos_id);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}