package br.com.uff.domain.entity.ca;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.uff.domain.AbstractEntity;
import br.com.uff.domain.entity.Usuario;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "CONTROLE_ACESSO_USUARIO")
@org.hibernate.annotations.Entity(
		dynamicUpdate = true)
public class ControleAcessoUsuario extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 5587686730511966918L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAUS_PK_ID")
	private Integer id;

	@Column(name = "CAUS_TX_SENHA", nullable = false)
	@NotEmpty
	private String senha;

	@OneToOne
	@NotNull
	private Usuario usuario;

	public ControleAcessoUsuario() {
		// Construtor Default
	}

	public ControleAcessoUsuario(String senha, Usuario usuario) {
		super();
		this.senha = senha;
		this.usuario = usuario;
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
