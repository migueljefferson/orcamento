package br.com.orcamento.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Requisicoes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "numero_req")
	private int requisicao;
	@Column(name = "Data")
	private Date data;
	@Column(name = "departamento_id")
	private int departamentos_id;
	@Column(name = "func_id_lancador")
	private int lancador;
	@Column(name = "func_id_aprovador")
	private int aprovador;

	public Requisicoes(int requisicao, Date data, int departamentos_id,
			int lancador, int aprovador) {
		super();
		this.requisicao = requisicao;
		this.data = data;
		this.departamentos_id = departamentos_id;
		this.lancador = lancador;
		this.aprovador = aprovador;

	}
	public Requisicoes() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getRequisicao() {
		return requisicao;
	}
	public void setRequisicao(int requisicao) {
		this.requisicao = requisicao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getDepartamentos_id() {
		return departamentos_id;
	}
	public void setDepartamentos_id(int departamentos_id) {
		this.departamentos_id = departamentos_id;
	}
	public int getLancador() {
		return lancador;
	}
	public void setLancador(int lancador) {
		this.lancador = lancador;
	}
	public int getAprovador() {
		return aprovador;
	}
	public void setAprovador(int aprovador) {
		this.aprovador = aprovador;
	}
	
	
}
