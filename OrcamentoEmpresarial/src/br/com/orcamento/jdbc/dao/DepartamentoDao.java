package br.com.orcamento.jdbc.dao;

import javax.persistence.EntityManager;

import br.com.orcamento.modelo.Departamento;

public class DepartamentoDao extends GenericoDao<Long, Departamento> {
	public DepartamentoDao(EntityManager em) {
		super(em);
	}

}
