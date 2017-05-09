package br.com.uff.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.uff.domain.AbstractEntity;
import br.com.uff.domain.enums.Status;

/*
 *Queries utilizadas pelo UsuarioDAO 
 */
@NamedQueries({ @NamedQuery(name = "buscaUsuarioByEmail", query = "select u from Usuario u where u.email=:email"),
		@NamedQuery(name = "buscaUsuarioLogin", query = "select u from Usuario u where (u.email=:email and u.senha=:senha "
				+ "and u.status=:status)") })

/**
 * 
 * Classe que representa a tabela Usuário
 * 
 */
@Entity
@Table(name = "USUARIO")
public class Usuario extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 4427330635629250875L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USUA_PK_ID")
	private Integer id;

	@Column(name = "USUA_TX_NOME", nullable = false)
	@NotEmpty
	private String nome;

	@Column(name = "USUA_TX_EMAIL", nullable = false, unique = true)
	@NotEmpty
	private String email;

	@Column(name = "USUA_TX_SENHA", nullable = false)
	@NotEmpty
	private String senha;

	@Column(name = "USUA_CK_IN_STATUS", nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull
	private Status status;

	@Column(name = "USUA_CK_IS_ADMIN", nullable = false)
	@NotNull
	private boolean isAdmin;

	public Usuario(String nome, String email, String senha, Status status) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.status = status;
	}

	public Usuario() {
		// Construtor Default
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}
