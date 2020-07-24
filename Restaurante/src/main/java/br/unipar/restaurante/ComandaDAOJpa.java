package br.unipar.restaurante;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class ComandaDAOJpa implements ComandaDAO {

	private final EntityManager em;
	
	public ComandaDAOJpa(EntityManagerFactory factory) {
		this.em = factory.createEntityManager();
	}
	
	public void salva(Comanda comanda) {
		EntityTransaction transacao = em.getTransaction();
		transacao.begin();
		em.merge(comanda);
		transacao.commit();
	}

	public Comanda busca(Integer id) {
		return em.find(Comanda.class, id);
	}
	
	public List<ItemComanda> itens() {
		String jqpl = "select c from ItemComanda c";
		TypedQuery<ItemComanda> query = em.createQuery(jqpl, Comanda.class);
		return query.getResultList();
	}

	public void deleta(Integer id) {
		Comanda comanda = busca(id);
		EntityTransaction transacao = em.getTransaction();
		transacao.begin();
		em.remove(comanda);
		transacao.commit();
	}
}
