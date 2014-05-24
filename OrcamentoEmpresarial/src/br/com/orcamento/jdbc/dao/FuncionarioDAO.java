package br.com.orcamento.jdbc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.orcamento.modelo.Funcionario;

public class FuncionarioDAO {
	@PersistenceContext(unitName = "OrcamentoEmpresarial")
	private EntityManager em;
	
	public void salvar(Funcionario bean){
		em.persist(bean);
	}

	public void atualizar(Funcionario bean) {
		em.merge(bean);

	}

	public void remover(Funcionario bean) {
		em.remove(bean);

	}

	public Funcionario getBean(Long id) {
		Funcionario bean = em.find(Funcionario.class, id);
		return bean;
	}

	public List<Funcionario> getBeans() {
		String f = "Select a From Funcionario a";
		@SuppressWarnings("unchecked")
		List<Funcionario> beansList = (List<Funcionario>) em.createQuery(f)
				.getResultList();
		return beansList;
	}

}
