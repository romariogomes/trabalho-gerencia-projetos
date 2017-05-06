package br.com.uff.domain.enums;

/**
 * 
 * Status do Usuário
 * 
 * @author lucas.fernandes
 *
 */
public enum Status {

	A("Ativo"), I("Inativo");

	private String status;

	private Status(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}
