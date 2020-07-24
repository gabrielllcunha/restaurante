package br.unipar.restaurante;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class ItemDAOJpa implements ItemDAO {

	private final EntityManager em;
	
	public ItemDAOJpa(EntityManagerFactory factory) {
		this.em = factory.createEntityManager();
	}
	
	public void salva(Item item) {
		EntityTransaction transacao = em.getTransaction();
		transacao.begin();
		em.merge(item);
		transacao.commit();
	}

	public Item busca(Integer id) {
		return em.find(Item.class, id);
	}


	public void deleta(Integer id) {
		Item item = busca(id);
		EntityTransaction transacao = em.getTransaction();
		transacao.begin();
		em.remove(item);
		transacao.commit();
	}

}
