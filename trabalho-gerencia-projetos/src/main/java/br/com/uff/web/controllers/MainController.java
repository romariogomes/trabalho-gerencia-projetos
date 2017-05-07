package br.com.uff.web.controllers;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.uff.domain.entity.Usuario;
import br.com.uff.web.BaseController;

@Named
@ViewScoped
public class MainController extends BaseController {

	private static final long serialVersionUID = 1L;

	protected Usuario usuarioLogado;

	@PostConstruct
	public void postConstruct() {
		buscaUsuarioAtual();
	}

}
