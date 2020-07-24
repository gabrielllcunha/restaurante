package br.unipar.restaurante;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private BigDecimal valor;
	
	public Item() {}
	
	public Item(Integer id, String descricao, BigDecimal valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Item(String descricao, BigDecimal valor) {
		this(null, descricao, valor);
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	
	@Override
	public String toString() {
		return "{id: " + id + ", descricao: '" + descricao + "', valor: '" + valor + "'}";
	}
	
}
