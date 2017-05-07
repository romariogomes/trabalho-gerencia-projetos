package br.com.uff.service.dao.exceptions;

import br.com.uff.exception.FatalException;

/**
 * Exceptions relacionadas a camada de Acesso ao Banco de Dados.
 */
public class DAOException extends FatalException {
	private static final long serialVersionUID = -1555104124339514398L;

	public DAOException(String message) {
		super(message);
	}

	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}
}
