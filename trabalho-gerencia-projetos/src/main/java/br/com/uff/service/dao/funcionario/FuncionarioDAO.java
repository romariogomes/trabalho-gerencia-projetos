package br.com.uff.service.dao.funcionario;

import javax.enterprise.context.RequestScoped;

import br.com.uff.domain.entity.Funcionario;
import br.com.uff.domain.repository.FuncionarioRepository;
import br.com.uff.service.dao.BaseDAO;

@RequestScoped
public class FuncionarioDAO extends BaseDAO<Funcionario> implements FuncionarioRepository {

}