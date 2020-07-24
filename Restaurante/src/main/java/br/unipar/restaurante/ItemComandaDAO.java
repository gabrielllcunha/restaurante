package br.unipar.restaurante;
import java.util.List;

public interface ItemComandaDAO {

	public void salva(ItemComanda itemComanda);
	public Item busca(Integer id);
	public Comanda busca(Integer id);
	public void deleta(Integer id);
	
}
