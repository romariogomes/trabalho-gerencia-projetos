package br.com.uff.infra;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Resources implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Produzir Log.
	 *
	 * @param injectionPoint
	 * @return Logger
	 */
	@Produces
	public Logger produceLog(InjectionPoint injectionPoint) {
		return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass());
	}

	/**
	 * Recupera uma inst�ncia de FacesContext.
	 *
	 * @return Devolve uma inst�ncia de FacesContext
	 */
	@Produces
	@RequestScoped
	public FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
}
