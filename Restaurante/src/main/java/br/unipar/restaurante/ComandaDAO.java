package br.unipar.restaurante;
import java.util.List;

public interface ComandaDAO {

	public void salva(Comanda comanda);
	public Comanda busca(Integer id);
	public List<ItemComanda> itens();
	public void deleta(Integer id);
}
