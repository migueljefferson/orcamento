package br.com.orcamento.jdbc.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;


public class GenericoDao<PK, T> {
	private EntityManager em;
	
	public GenericoDao(EntityManager em) {
		this.em = em;
	}
	
	public T getById(PK pk){
		return (T) em.find(getTypeClass(), pk);
		
	}
    public void save(T entity) {
        em.persist(entity);
    }
 
    public void update(T entity) {
        em.merge(entity);
    }
 
    public void delete(T entity) {
        em.remove(entity);
    }
 
    public List<T> getLista() {
        return em.createQuery(("FROM " + getTypeClass().getName()))
                .getResultList();
    }
 
    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
        return clazz;
    }
	
	

}
