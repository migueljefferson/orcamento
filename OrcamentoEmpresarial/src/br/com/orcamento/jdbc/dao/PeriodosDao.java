package br.com.orcamento.jdbc.dao;

import javax.persistence.EntityManager;

import br.com.orcamento.modelo.Periodos;

public class PeriodosDao extends GenericoDao<Long, Periodos> {

	public PeriodosDao(EntityManager em) {
		super(em);
	}

}
