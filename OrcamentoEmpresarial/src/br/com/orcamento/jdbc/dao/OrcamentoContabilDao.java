package br.com.orcamento.jdbc.dao;

import javax.persistence.EntityManager;

import br.com.orcamento.modelo.OrcamentoContabil;

public class OrcamentoContabilDao extends GenericoDao<Long, OrcamentoContabil> {

	public OrcamentoContabilDao(EntityManager em) {
		super(em);

	}

}
