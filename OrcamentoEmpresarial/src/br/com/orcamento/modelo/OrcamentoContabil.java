package br.com.orcamento.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrcamentoContabil {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "orcamento_id")
	private int orcamento;
	@Column(name = "departamento_id")
	private int departamento;
	@Column(name = "rubrica_id")
	private int rubrica;
	@Column(name = "valor_orcado")
	private double valor;
	@Column(name = "saldo")
	private double saldo;

	public OrcamentoContabil(int orcamento, int departamento, int rubrica,
			double valor, double saldo) {
		super();
		this.orcamento = orcamento;
		this.departamento = departamento;
		this.rubrica = rubrica;
		this.valor = valor;
		this.saldo = saldo;
	}
	
	public OrcamentoContabil() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(int orcamento) {
		this.orcamento = orcamento;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public int getRubrica() {
		return rubrica;
	}

	public void setRubrica(int rubrica) {
		this.rubrica = rubrica;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
