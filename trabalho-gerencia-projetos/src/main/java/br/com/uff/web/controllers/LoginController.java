package br.com.uff.web.controllers;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.uff.domain.entity.Usuario;
import br.com.uff.service.dao.exceptions.DAOException;
import br.com.uff.service.servicos.LoginService;
import br.com.uff.web.BaseController;

@Named
@ViewScoped
public class LoginController extends BaseController {

	private static final long serialVersionUID = 1L;

	private Usuario usuario;

	@Inject
	private LoginService loginService;

	@PostConstruct
	public void postConstruct() {
		usuario = new Usuario();
	}

	/**
	 * 
	 * efetua login
	 * 
	 * @return
	 */
	public String efetuaLogin() {
		try {
			Usuario usuarioLogado = loginService.buscaUsuarioLogin(usuario);
			FacesContext context = FacesContext.getCurrentInstance();
			if (usuarioLogado != null) {
				context.getExternalContext().getSessionMap().put("usuarioLogado", usuarioLogado);
				return "homeLogada?faces-redirect=true";
			}
			return null;
		} catch (DAOException exception) {
			log.error(exception.getMessage(), exception);
		} 
		
		return "index?faces-redirect=true";

	}

	/**
	 * 
	 * deslogar
	 * 
	 * @return
	 */
	public String deslogar() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getSessionMap().remove("usuarioLogado");

		return "index?faces-redirect=true";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
