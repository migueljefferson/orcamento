package br.com.orcamento.jdbc.dao;

import javax.persistence.EntityManager;

import br.com.orcamento.modelo.Requisicoes;

public class RequisicoesDao extends GenericoDao<Long, Requisicoes> {

	public RequisicoesDao(EntityManager em) {
		super(em);

	}

}
