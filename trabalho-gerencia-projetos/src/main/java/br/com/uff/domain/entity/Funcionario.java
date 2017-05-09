package br.com.uff.domain.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.uff.domain.AbstractEntity;

@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FUNC_PK_ID")
	private Integer id;

	@Column(name = "FUNC_TX_NOME", nullable = false)
	@NotEmpty
	private String nome;

	@Column(name = "FUNC_NM_TEMPO_EMPRESA", nullable = false)
	private int tempoEmpresa;

	@Column(name = "FUNC_NM_VALOR_DIA", nullable = false)
	private double valorDia;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Conhecimento conhecimento;

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

	public int getTempoEmpresa() {
		return tempoEmpresa;
	}

	public void setTempoEmpresa(int tempoEmpresa) {
		this.tempoEmpresa = tempoEmpresa;
	}

	public double getValorDia() {
		return valorDia;
	}

	public void setValorDia(double valorDia) {
		this.valorDia = valorDia;
	}

	public Conhecimento getConhecimento() {
		return conhecimento;
	}

	public void setConhecimento(Conhecimento conhecimento) {
		this.conhecimento = conhecimento;
	}

}
