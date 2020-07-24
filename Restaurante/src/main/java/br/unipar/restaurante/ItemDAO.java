package br.unipar.restaurante;
import java.util.List;

public interface ItemDAO {

	public void salva(Item item);
	public Item busca(Integer id);
	public void deleta(Integer id);
	
}
