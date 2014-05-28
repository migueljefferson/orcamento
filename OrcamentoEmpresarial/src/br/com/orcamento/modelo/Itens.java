package br.com.orcamento.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Itens {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "rubricas_id")
	private int rubricas;

	public Itens(String nome, int rubricas) {
		super();
		this.nome = nome;
		this.rubricas = rubricas;

	}

	public Itens() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRubricas() {
		return rubricas;
	}

	public void setRubricas(int rubricas) {
		this.rubricas = rubricas;
	}

}
