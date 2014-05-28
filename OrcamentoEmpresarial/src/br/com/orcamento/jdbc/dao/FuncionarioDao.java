package br.com.orcamento.jdbc.dao;

import javax.persistence.EntityManager;

import br.com.orcamento.modelo.Funcionario;

public class FuncionarioDao extends GenericoDao<Long, Funcionario> {
	public FuncionarioDao(EntityManager em) {
		super(em);
	}
}