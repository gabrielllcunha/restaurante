package br.unipar.restaurante;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemComanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal quantidade;
	private BigDecimal valorTotal;
	
	public ItemComanda() {}
	
	public ItemComanda(Integer id, BigDecimal quantidade, BigDecimal valorTotal) {
		this.id = id;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
	}
	
	public ItemComanda(BigDecimal quantidade, BigDecimal valorTotal) {
		this(null, quantidade, valorTotal);
	}
	
	public Integer getId() {
		return id;
	}
	
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	
	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	
	@Override
	public String toString() {
		return "{id: " + id + ", quantidade: '" + quantidade + "', valorTotal: '" + valorTotal + "'}";
	}
	
}