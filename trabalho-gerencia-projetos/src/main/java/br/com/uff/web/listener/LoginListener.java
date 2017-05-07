package br.com.uff.web.listener;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.com.uff.domain.entity.Usuario;

public class LoginListener implements PhaseListener {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * Método que será responsável pela verificacão assim que toda página xhtml
	 * for chamada.
	 * 
	 */
	@Override
	public void afterPhase(PhaseEvent event) {
		FacesContext context = event.getFacesContext();
		String nomePagina = context.getViewRoot().getViewId();

		Usuario usuarioLogado = (Usuario) context.getExternalContext().getSessionMap().get("usuarioLogado");
		if (usuarioLogado != null) {
			return;
		}
		
		if (nomePagina.equals("/index.xhtml") || nomePagina.equals("/login.xhtml")) {
			return;
		}


		NavigationHandler handler = context.getApplication().getNavigationHandler();
		handler.handleNavigation(context, null, "index?faces-redirect=true");
		context.renderResponse();
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		// TODO Auto-generated method stub
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}
