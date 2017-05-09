package br.com.uff.web.controllers;

import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.uff.domain.entity.Conhecimento;
import br.com.uff.domain.entity.Funcionario;
import br.com.uff.service.servicos.FuncionarioService;
import br.com.uff.web.BaseController;

@Named
@ViewScoped
public class UsuarioAdminController extends BaseController {

	private static final long serialVersionUID = 1L;

	@Inject
	private FuncionarioService funcionarioService;

	private List<Funcionario> funcionarios;

	private Funcionario funcionario;

	@PostConstruct
	public void postConstruct() {
		buscaUsuarioAtual();
		funcionarios = funcionarioService.buscaTodos();
		instanciaObjetoFuncionario();
	}

	private void instanciaObjetoFuncionario() {
		funcionario = new Funcionario();
		funcionario.setConhecimento(new Conhecimento());
	}

	public String salvarFuncionario() {
		funcionarioService.salvarFuncionario(funcionario);
		return "usuario-admin-logado?faces-redirect=true";
	}

	public String limparFormulario() {
		instanciaObjetoFuncionario();
		return "usuario-admin-logado?faces-redirect=true";
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios != null ? Collections.unmodifiableList(funcionarios) : null;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public FuncionarioService getFuncionarioService() {
		return funcionarioService;
	}

	public void setFuncionarioService(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
