package br.com.uff.service.dao.usuario;

import javax.enterprise.context.RequestScoped;
import javax.persistence.TypedQuery;

import br.com.uff.domain.entity.Usuario;
import br.com.uff.domain.enums.Status;
import br.com.uff.domain.repository.UsuarioRepository;
import br.com.uff.service.dao.BaseDAO;
import br.com.uff.service.dao.NamedQueryParams;

@RequestScoped
public class UsuarioDAO extends BaseDAO<Usuario> implements UsuarioRepository {

	@Override
	public Usuario buscaUsuarioByEmail(String email) {
		TypedQuery<Usuario> query = em.createNamedQuery("buscaUsuarioByEmail", Usuario.class);
		query.setParameter(NamedQueryParams.EMAIL, email);
		return query.getSingleResult();
	}

	@Override
	public Usuario buscaUsuarioLogin(String email, String senha) {
		TypedQuery<Usuario> query = em.createNamedQuery("buscaUsuarioLogin", Usuario.class);
		query.setParameter(NamedQueryParams.EMAIL, email);
		query.setParameter(NamedQueryParams.SENHA, senha);
		query.setParameter(NamedQueryParams.STATUS, Status.A);
		return query.getSingleResult();
	}

}