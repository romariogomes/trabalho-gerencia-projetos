package br.com.uff.domain.valueobject;

public class CicloDeVida {
	
	private String descricao;
	
	public CicloDeVida() {
		// TODO Auto-generated constructor stub
	}

	public CicloDeVida(String descricao) {
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
