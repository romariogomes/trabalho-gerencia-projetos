package br.com.uff.domain.valueobject;

public class Atividade {
	
	private String nome;
	private Double custo;
	private Integer duracaoDias;
	private Integer ordem;
	
	public Atividade() {
		// TODO Auto-generated constructor stub
	}

	public Atividade(String nome, Double custo, Integer duracaoDias, Integer ordem) {
		super();
		this.nome = nome;
		this.custo = custo;
		this.duracaoDias = duracaoDias;
		this.ordem = ordem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public Integer getDuracaoDias() {
		return duracaoDias;
	}

	public void setDuracaoDias(Integer duracaoDias) {
		this.duracaoDias = duracaoDias;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	
}
