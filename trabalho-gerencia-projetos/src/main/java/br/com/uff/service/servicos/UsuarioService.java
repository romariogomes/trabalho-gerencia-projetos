package br.com.uff.service.servicos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.uff.domain.entity.Usuario;
import br.com.uff.domain.repository.UsuarioRepository;
import br.com.uff.domain.utils.Utils;

@Stateless
public class UsuarioService {

	@Inject
	private UsuarioRepository usuarioRepository;

	public List<Usuario> buscaTodos() {
		return usuarioRepository.buscarTodos();
	}

	public Usuario gravarUsuario(Usuario usuario) {
		usuario.setSenha(Utils.encriptaSenha(usuario.getSenha()));
		return usuarioRepository.gravar(usuario);
	}

	public void excluirUsuario(Usuario usuario) {
		usuarioRepository.excluir(usuario);
	}

	public Usuario buscaUsuario(Usuario usuario) {
		return usuarioRepository.buscarPorId(usuario.getId());
	}

}
