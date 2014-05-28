package br.com.orcamento.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "chefe")
	private int chefe;

	public Departamento(String nome, int id_chefe) {
		super();
		this.nome = nome;
		this.chefe = id_chefe;

	}
	
	public Departamento() {
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

	public int getChefe() {
		return chefe;
	}

	public void setChefe(int chefe) {
		this.chefe = chefe;
	}
	
	

}
