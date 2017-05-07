package br.com.uff.web.controllers;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.uff.domain.entity.Usuario;
import br.com.uff.service.servicos.UsuarioService;
import br.com.uff.web.BaseController;

@Named
@ViewScoped
public class UsuarioController extends BaseController {

	private static final long serialVersionUID = 1L;

	private Usuario usuario;
	
	@Inject
	private UsuarioService usuarioService;

	@PostConstruct
	public void postConstruct() {
		buscaUsuarioAtual();
		usuario = usuarioLogado;
		usuarioService.buscaUsuario(usuario);
	}
	
	/**
	 * 
	 * Grava Usuário
	 * 
	 * @param usuario
	 * @return
	 */
	public Usuario cadastraUsuario() {
		return usuarioService.gravarUsuario(usuario);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

}
