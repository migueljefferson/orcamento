package br.com.orcamento.jdbc.dao;

import javax.persistence.EntityManager;

import br.com.orcamento.modelo.Rubricas;

public class RubricasDao extends GenericoDao<Long, Rubricas> {

	public RubricasDao(EntityManager em) {
		super(em);

	}

}
