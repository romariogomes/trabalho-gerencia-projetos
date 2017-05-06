package br.com.uff.domain;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * Super classe abstrata para todas as entidades dos sistemas.
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
	private static final long serialVersionUID = -722405405688105038L;
	
	public abstract Integer getId();
	
	public abstract void setId(Integer id);

}
