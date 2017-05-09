package br.com.uff.domain.valueobject;

public class Tecnologia {
	
	private String descricao;
	
	public Tecnologia() {
		// TODO Auto-generated constructor stub
	}

	public Tecnologia(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
