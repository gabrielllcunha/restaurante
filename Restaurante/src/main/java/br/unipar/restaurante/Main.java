package br.unipar.restaurante;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("restaurante");
		
		ComandaDAO dao1 = new ComandaDAOJpa(factory);
		
		ItemComandaDAO dao2 = new ItemComandaDAOJpa(factory);
		
		ItemDAO dao3 = new ItemDAOJpa(factory);

		List<ItemComanda> itens = dao1.lista();
		System.out.println(itens);
		
		factory.close();
		System.out.println("Finalizado!");
		
	}

}
