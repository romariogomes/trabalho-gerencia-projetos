package br.com.uff.web.controllers;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.uff.domain.entity.Usuario;
import br.com.uff.domain.valueobject.enums.Status;
import br.com.uff.service.servicos.UsuarioService;
import br.com.uff.web.BaseController;

@Named
@ViewScoped
public class UsuarioController extends BaseController {

	private static final long serialVersionUID = 1L;

	private Usuario usuario;

	@Inject
	private UsuarioService usuarioService;

	//TODO Refazer esse PostConstruct
	@PostConstruct
	public void postConstruct() {
		buscaUsuarioAtual();
		usuario = usuarioLogado;
		if (usuario != null) {
			usuarioService.buscaUsuario(usuario);
		} else{
			usuario = new Usuario();
		}
	}

	//TODO Apresentar uma msg na tela e redirecionar para a pagina logado
	/**
	 * 
	 * Cadastra novo usuário
	 * 
	 * @return
	 */
	public String cadastraUsuario() {
		usuario.setStatus(Status.A);
		usuarioService.gravarUsuario(usuario);
		return "index?faces-redirect=true";
	}

	/**
	 * 
	 * Atualiza usuário
	 * 
	 * @return
	 */
	public Usuario atualizaUsuario() {
		return usuarioService.atualizaUsuario(usuario);
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
