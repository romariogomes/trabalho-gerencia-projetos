package br.com.uff.service.servicos;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.uff.domain.entity.Usuario;
import br.com.uff.domain.repository.UsuarioRepository;
import br.com.uff.domain.utils.Utils;

@Stateless
public class LoginService {

	@Inject
	private UsuarioRepository usuarioRepository;

	public Usuario buscaUsuarioLogin(Usuario usuario) {
		return usuarioRepository.buscaUsuarioLogin(usuario.getEmail(), Utils.encriptaSenha(usuario.getSenha()));
	}

	public Usuario buscaUsuario(Usuario usuario) {
		return usuarioRepository.buscarPorId(usuario.getId());
	}

}
