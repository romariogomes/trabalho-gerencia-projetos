package br.com.uff.domain.repository;

import br.com.uff.domain.BaseRepository;
import br.com.uff.domain.entity.Usuario;

public interface UsuarioRepository extends BaseRepository<Usuario> {

	/**
	 * 
	 * Busca um Usuário por Email
	 * 
	 * @param email
	 * @return
	 */
	Usuario buscaUsuarioByEmail(String email);

	/**
	 * 
	 * Query que retorna o usuário ativo do sistema
	 * 
	 * @param email
	 * @param senha
	 * @return
	 */
	Usuario buscaUsuarioLogin(String email, String senha);

}
