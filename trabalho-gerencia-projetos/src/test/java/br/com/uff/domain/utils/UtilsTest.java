package br.com.uff.domain.utils;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void geraSenha() {
		String senha = "123";
		System.out.println("Senha Encriptada: " + Utils.encriptaSenha(senha));
	}
	
}
