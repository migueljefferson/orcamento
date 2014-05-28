package br.com.orcamento.jdbc.dao;

import javax.persistence.EntityManager;

import br.com.orcamento.modelo.Orcamento;

public class OrcamentoDao extends GenericoDao<Long, Orcamento>{

	public OrcamentoDao(EntityManager em) {
		super(em);
		
	}

}
