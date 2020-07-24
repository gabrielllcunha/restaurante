package br.unipar.restaurante;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class ItemComandaDAOJpa implements ItemComandaDAO {

	private final EntityManager em;
	
	public ItemComandaDAOJpa(EntityManagerFactory factory) {
		this.em = factory.createEntityManager();
	}
	
	public void salva(ItemComanda itemComanda) {
		EntityTransaction transacao = em.getTransaction();
		transacao.begin();
		em.merge(itemComanda);
		transacao.commit();
	}

	public Item busca(Integer id) {
		return em.find(Item.class, id);
	}
	
	public Comanda busca(Integer id) {
		return em.find(Comanda.class, id);
	}

	public void deleta(Integer id) {
		Animal animal = busca(id);
		EntityTransaction transacao = em.getTransaction();
		transacao.begin();
		em.remove(itemComanda);
		transacao.commit();
	}
}
