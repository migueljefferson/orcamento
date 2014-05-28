package br.com.orcamento.jdbc.dao;

import javax.persistence.EntityManager;

import br.com.orcamento.modelo.LinhasRequisicoes;

public class LinhasRequsicoesDao extends GenericoDao<Long, LinhasRequisicoes> {
	public LinhasRequsicoesDao(EntityManager em) {
		super(em);

	}

}
