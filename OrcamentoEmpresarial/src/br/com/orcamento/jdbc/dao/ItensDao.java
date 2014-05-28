package br.com.orcamento.jdbc.dao;

import javax.persistence.EntityManager;

import br.com.orcamento.modelo.Itens;

public class ItensDao extends GenericoDao<Long, Itens> {
	public ItensDao(EntityManager em) {
		super(em);
	}
}
