package br.com.orcamento.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LinhasRequisicoes {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="itens_id")
	private int itens;
	@Column(name="requisicoes")
	private int requisicoes;
	@Column(name="quantidade")
	private double quantidade;
	@Column(name="valor")
	private double valor;
	
	public LinhasRequisicoes(int itens, int requisicoes,
			double quantidade, double valor) {
		super();
		this.itens = itens;
		this.requisicoes = requisicoes;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public LinhasRequisicoes() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getItens() {
		return itens;
	}

	public void setItens(int itens) {
		this.itens = itens;
	}

	public int getRequisicoes() {
		return requisicoes;
	}

	public void setRequisicoes(int requisicoes) {
		this.requisicoes = requisicoes;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
