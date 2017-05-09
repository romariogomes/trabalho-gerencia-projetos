package br.com.uff.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.uff.domain.AbstractEntity;
import br.com.uff.domain.valueobject.enums.Nivel;

@Entity
@Table(name = "CONHECIMENTO")
public class Conhecimento extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = -8399671446659980732L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONH_PK_ID")
	private Integer id;

	@Column(name = "CONH_TX_DESCRICAO_SKILL", nullable = false)
	@NotEmpty
	private String descricaoSkill;

	@Column(name = "CONH_CK_IN_NIVEL", nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull
	private Nivel nivel;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricaoSkill() {
		return descricaoSkill;
	}

	public void setDescricaoSkill(String descricaoSkill) {
		this.descricaoSkill = descricaoSkill;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

}
