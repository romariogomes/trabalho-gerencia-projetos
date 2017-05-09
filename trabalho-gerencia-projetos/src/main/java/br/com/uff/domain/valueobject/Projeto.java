package br.com.uff.domain.valueobject;

import java.util.ArrayList;
import java.util.List;

import br.com.uff.domain.entity.Funcionario;
import br.com.uff.domain.entity.GameCase;

public class Projeto {

	private String nome;
	private List<Tecnologia> tecnologias;
	private List<Funcionario> funcionarios;
	private CicloDeVida cicloDeVida;
	
	//o lance do usuario escolher a ordem do escopo ou produto. Se escolher escopo do produto primeiro, true, caso contrario false
	private boolean escopo;
	
	//em numero de dias
	private Integer cronograma;
	
	private List<Atividade> atividades;
	private String gerente;
	private GameCase caseGame;
	
	public Projeto() {
		tecnologias = new ArrayList<Tecnologia>();
		funcionarios = new ArrayList<Funcionario>();
		atividades = new ArrayList<Atividade>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Tecnologia> getTecnologias() {
		return tecnologias;
	}

	public void setTecnologias(List<Tecnologia> tecnologias) {
		this.tecnologias = tecnologias;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public CicloDeVida getCicloDeVida() {
		return cicloDeVida;
	}

	public void setCicloDeVida(CicloDeVida cicloDeVida) {
		this.cicloDeVida = cicloDeVida;
	}

	public boolean isEscopo() {
		return escopo;
	}

	public void setEscopo(boolean escopo) {
		this.escopo = escopo;
	}

	public Integer getCronograma() {
		return cronograma;
	}

	public void setCronograma(Integer cronograma) {
		this.cronograma = cronograma;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public GameCase getCaseGame() {
		return caseGame;
	}

	public void setCaseGame(GameCase caseGame) {
		this.caseGame = caseGame;
	}
	
}
