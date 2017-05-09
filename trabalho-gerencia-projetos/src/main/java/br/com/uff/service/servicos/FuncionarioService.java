package br.com.uff.service.servicos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.uff.domain.entity.Funcionario;
import br.com.uff.domain.repository.FuncionarioRepository;

@Stateless
public class FuncionarioService {

	@Inject
	private FuncionarioRepository funcionarioRepository;

	public List<Funcionario> buscaTodos() {
		return funcionarioRepository.buscarTodos();
	}

	public void salvarFuncionario(Funcionario funcionario) {
		funcionarioRepository.gravar(funcionario);
	}

}
