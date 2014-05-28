package br.com.orcamento.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 4)
	private int id;
	@Column(name = "nome", length = 100)
	private String nome;
	@Column(name = "email", length = 50)
	private String email;
	@Column(name = "logradouro", length = 100)
	private String logradouro;
	@Column(name = "numero", length = 4)
	private int numero;
	@Column(name = "bairro", length = 25)
	private String bairro;
	@Column(name = "municipio", length = 25)
	private String municipio;
	@Column(name = "estado", length = 2)
	private String estado;
	@Column(name = "cep", length = 8)
	private int cep;
	@Column(name = "departamento")
	private int departamentos_id;
	@Column(name = "senha", length = 11)
	private String senha;

	public Funcionario(String nome, String email, String logradouro,
			int numero, String bairro, String municipio, String estado,
			int cep, int departamentos_id, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
		this.cep = cep;
		this.departamentos_id = departamentos_id;
		this.senha = senha;

	}
	public Funcionario() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getDepartamentos_id() {
		return departamentos_id;
	}

	public void setDepartamentos_id(int departamentos_id) {
		this.departamentos_id = departamentos_id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}