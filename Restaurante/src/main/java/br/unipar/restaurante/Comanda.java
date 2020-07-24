package br.unipar.restaurante;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime data;
	private Integer mesa;
	private List<ItemComanda> itens;
	
	public Comanda() {}
	
	public Comanda(Integer id, LocalDateTime data, Integer mesa, List<ItemComanda> itens) {
		this.id = id;
		this.data = data;
		this.mesa = mesa;
		this.itens = itens;
	}
	
	public Comanda(LocalDateTime data, Integer mesa, List<ItemComanda> itens) {
		this(null, data, mesa, itens);
	}
	
	public Integer getId() {
		return id;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public Integer getMesa() {
		return mesa;
	}

	public List<ItemComanda> getItens() {
		return itens;
	}
	
	@Override
	public String toString() {
		return "{id: " + id + ", data: '" + data + "', mesa: '" + mesa + "', itens: '" + itens + "'}";
	}
	
}