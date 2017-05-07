package br.com.uff.web;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;

import br.com.uff.domain.entity.Usuario;

public class BaseController implements Serializable {

	private static final long serialVersionUID = 1L;

	protected static final String LINK_PARAM = "link_param";

	@Inject
	protected Logger log;

	@Inject
	protected FacesContext facesContext;
	
	protected Usuario usuarioLogado;

	/**
	 * Obtém um parâmetro na requisição atual a partir do nome dado
	 *
	 * @param nomeParametro
	 *            nome do parametro a ser obtido na requisição
	 * @return Valor associado ao nome do parametro passado
	 */
	protected String getParametroRequisicao(String nomeParametro) {
		return facesContext.getExternalContext().getRequestParameterMap().get(nomeParametro);
	}
	
	/**
	 * 
	 */
	protected void buscaUsuarioAtual() {
		usuarioLogado = (Usuario) facesContext.getExternalContext().getSessionMap().get("usuarioLogado");
	}

	/**
	 * Método que adiciona uma mensagem no contexto do FacesContext
	 *
	 * @param clientId
	 *            Id do componente de destino da mensagem
	 * @param severidade
	 *            Severidade da mensagem
	 * @param resumo
	 *            Resumo da mensagem
	 * @param detalhe
	 *            A mensagem com mais detalhes
	 */
	private void addMessageToFacesContext(String clientId, Severity severidade, String resumo, String detalhe) {
		FacesMessage facesMessage = new FacesMessage(severidade, resumo, detalhe);
		facesContext.addMessage(clientId, facesMessage);
	}

	/**
	 * Adiciona mensagem de erro ao contexto do Faces
	 *
	 * @param resumo
	 *            Resumo da mensagem
	 * @param detalhe
	 *            A mensagem com mais detalhes
	 */
	protected void addErrorMessageToFacesContext(String resumo, String detalhe) {
		addErrorMessageToFacesContext(null, resumo, detalhe);
	}

	/**
	 * Adiciona mensagem de erro ao contexto do Faces
	 *
	 * @param clientId
	 *            Id do componente de destino da mensagem
	 * @param resumo
	 *            Resumo da mensagem
	 * @param detalhe
	 *            A mensagem com mais detalhes
	 */
	protected void addErrorMessageToFacesContext(String clientId, String resumo, String detalhe) {
		addMessageToFacesContext(clientId, FacesMessage.SEVERITY_ERROR, resumo, detalhe);
	}

	/**
	 * Adiciona mensagem de informação ao contexto do Faces
	 *
	 * @param resumo
	 *            Resumo da mensagem
	 * @param detalhe
	 *            A mensagem com mais detalhes
	 */
	protected void addInfoMessageToFacesContext(String resumo, String detalhe) {
		addInfoMessageToFacesContext(null, resumo, detalhe);
	}

	/**
	 * Adiciona mensagem de erro ao contexto do Faces
	 *
	 * @param clientId
	 *            Id do componente de destino da mensagem
	 * @param resumo
	 *            Resumo da mensagem
	 * @param detalhe
	 *            A mensagem com mais detalhes
	 */
	protected void addInfoMessageToFacesContext(String clientId, String resumo, String detalhe) {
		addMessageToFacesContext(clientId, FacesMessage.SEVERITY_INFO, resumo, detalhe);
	}

	/**
	 * Adiciona mensagem de aviso ao contexto do Faces
	 *
	 * @param resumo
	 *            Resumo da mensagem
	 * @param detalhe
	 *            A mensagem com mais detalhes
	 */
	protected void addWarnMessageToFacesContext(String resumo, String detalhe) {
		addWarnMessageToFacesContext(null, resumo, detalhe);
	}

	/**
	 * Adiciona mensagem de erro ao contexto do Faces
	 *
	 * @param clientId
	 *            Id do componente de destino da mensagem
	 * @param resumo
	 *            Resumo da mensagem
	 * @param detalhe
	 *            A mensagem com mais detalhes
	 */
	protected void addWarnMessageToFacesContext(String clientId, String resumo, String detalhe) {
		addMessageToFacesContext(clientId, FacesMessage.SEVERITY_WARN, resumo, detalhe);
	}

	/**
	 * Get Logger.
	 *
	 * @return logger
	 */
	protected Logger getLog() {
		return log;
	}

	/**
	 * Retorna o locale ativo.
	 *
	 * @return Locale ativo
	 */
	protected Locale getLocale() {
		return facesContext.getViewRoot().getLocale();
	}

	/**
	 * Adicionar id de componente para Ajax Render.
	 *
	 * @param component
	 */
	protected void addComponentToRender(String... component) {
		for (String render : component) {
			facesContext.getPartialViewContext().getRenderIds().add(render);
		}
	}

	/**
	 * Tratar ConstraintViolationException.
	 * 
	 * @param exception
	 * @return handled
	 */
	protected boolean handleValidationException(Exception exception) {
		Throwable cause = exception.getCause();

		if (cause instanceof ConstraintViolationException) {
			for (ConstraintViolation<?> violation : ((ConstraintViolationException) cause).getConstraintViolations()) {
				addErrorMessageToFacesContext(violation.getMessage(), "");
			}

			return true;
		}
		return false;
	}
	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

}
