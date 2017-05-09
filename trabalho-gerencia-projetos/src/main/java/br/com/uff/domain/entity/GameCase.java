package br.com.uff.domain.entity;

public class GameCase {

	private Integer id;
	private String nome;
	private String descricao;
	
	//em numero de dias
	private Integer cronograma;
	private Double custo;
	
	public GameCase() {
		// TODO Auto-generated constructor stub
	}

	public GameCase(Integer id, String nome, String descricao, Integer cronograma, Double custo) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.cronograma = cronograma;
		this.custo = custo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCronograma() {
		return cronograma;
	}

	public void setCronograma(Integer cronograma) {
		this.cronograma = cronograma;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}
	
}
