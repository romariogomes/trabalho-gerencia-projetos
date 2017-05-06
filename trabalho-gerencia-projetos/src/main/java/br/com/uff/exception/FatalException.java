package br.com.uff.exception;

/**
 * 
 * Exception fatal básica do sistema
 * 
 * @author lucas.fernandes
 *
 */
public class FatalException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FatalException() {
		super();
	}

	public FatalException(String message) {
		super(message);
	}

	public FatalException(Throwable cause) {
		super(cause);
	}

	public FatalException(String message, Throwable cause) {
		super(message, cause);
	}

}
