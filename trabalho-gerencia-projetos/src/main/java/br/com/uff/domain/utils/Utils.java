package br.com.uff.domain.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.uff.exception.FatalException;

public class Utils {

	/**
	 * 
	 * Método responsável por encriptar senha do usuário
	 * 
	 * @param senha
	 * @return
	 */
	public static final String encriptaSenha(String senha) {
		MessageDigest algorithm = null;
		byte messageDigest[] = null;
		try {
			algorithm = MessageDigest.getInstance("SHA-256");
			messageDigest = algorithm.digest(senha.getBytes("UTF-8"));
		} catch (NoSuchAlgorithmException exception) {
			throw new FatalException(exception.getMessage());
		} catch (UnsupportedEncodingException exception) {
			throw new FatalException(exception.getMessage());
		}
		StringBuilder hexString = new StringBuilder();
		for (byte b : messageDigest) {
			hexString.append(String.format("%02X", 0xFF & b));
		}
		return hexString.toString();
	}

}
