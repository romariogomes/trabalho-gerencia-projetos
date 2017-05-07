package br.com.uff.service.dao;

import static com.google.common.base.Preconditions.checkNotNull;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.uff.domain.AbstractEntity;
import br.com.uff.domain.BaseRepository;
import br.com.uff.service.dao.exceptions.DAOException;

@SuppressWarnings("unchecked")
public class BaseDAO<E extends AbstractEntity> implements BaseRepository<E> {

	private static final Logger LOG = LoggerFactory.getLogger(BaseDAO.class);

	@PersistenceContext
	protected EntityManager em;

	protected Class<E> clazz;

	@PostConstruct
	public void postConstruct() {
		clazz = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public Session getSession() {
		return (Session) em.getDelegate();
	}

	@Override
	public E buscarPorId(int id) {
		return em.find(clazz, id);
	}

	@Override
	public List<E> buscarTodos() {
		return em.createQuery("from " + clazz.getName()).getResultList();
	}

	@Override
	public E persist(E entidade) {
		try {
			em.persist(entidade);
			em.flush();

			return entidade;
		} catch (PersistenceException exception) {
			LOG.error(exception.getMessage(), exception);
			throw new DAOException(exception.getMessage(), exception);
		}

	}

	@Override
	public E merge(E entidade) {
		try {
			E entidadePersistida = em.merge(entidade);
			em.flush();

			return entidadePersistida;
		} catch (PersistenceException exception) {
			LOG.error(exception.getMessage(), exception);
			throw new DAOException(exception.getMessage(), exception);
		}
	}

	@Override
	public List<E> merge(List<E> entidades) {
		try {
			List<E> entidadesAtualizadas = new ArrayList<E>();
			for (E entidade : entidades) {
				em.merge(entidade);
				entidadesAtualizadas.add(entidade);
			}

			return entidadesAtualizadas;

		} catch (PersistenceException exception) {
			LOG.error(exception.getMessage(), exception);
			throw new DAOException(exception.getMessage(), exception);
		}
	}

	@Override
	public void refresh(E entidade) {
		em.refresh(entidade);
	}

	@Override
	public E gravar(E entidade) {
		try {
			E entidadePersistida = entidade;

			if (entidade.getId() == null) {
				em.persist(entidade);
			} else {
				entidadePersistida = em.merge(entidade);
			}

			em.flush();

			return entidadePersistida;
		} catch (PersistenceException exception) {
			LOG.error(exception.getMessage(), exception);
			throw new DAOException(exception.getMessage(), exception);
		}

	}

	@Override
	public void excluir(E entidade) {
		checkNotNull(entidade);
		checkNotNull(entidade.getId());

		try {
			if (!em.contains(entidade)) {
				entidade = buscarPorId(entidade.getId());
				checkNotNull(entidade);
			}

			em.remove(entidade);
			em.flush();
		} catch (PersistenceException exception) {
			LOG.error(exception.getMessage(), exception);
			throw new DAOException(exception.getMessage(), exception);
		}

	}

}