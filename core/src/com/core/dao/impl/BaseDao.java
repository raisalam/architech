package com.core.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;
import com.api.exceptions.PersistenceException;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseDao.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public abstract class BaseDao
{
	
	/** The session factory. */
	private SessionFactory sessionFactory;

	/**
	 * Gets the session factory.
	 *
	 * @return the session factory
	 */
	public SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

	/**
	 * Sets the session factory.
	 *
	 * @param sessionFactory the new session factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Save.
	 *
	 * @param object the object
	 * @return the object
	 */
	protected Object save(Object object)
	{
		Object retObject;
		try
		{
			Session session = getSessionFactory().getCurrentSession();
			retObject = session.save(object);
			session.flush();
		}
		catch (ConstraintViolationException exception)
		{
			throw new PersistenceException(exception);
		}
		catch (PersistenceException exception)
		{
			throw new PersistenceException(exception);
		}
		return retObject;
	}

	/**
	 * Update.
	 *
	 * @param object the object
	 * @return the object
	 */
	protected Object update(Object object)
	{
		Object retObject;
		try
		{
			Session session = getSessionFactory().getCurrentSession();
			retObject = session.merge(object);
			session.flush();
		}
		catch (ConstraintViolationException exception)
		{
			throw new PersistenceException(exception);
		}
		catch (PersistenceException exception)
		{
			throw new PersistenceException(exception);
		}
		return retObject;
	}

	/**
	 * Delete.
	 *
	 * @param object the object
	 * @return the object
	 */
	protected Object delete(Object object)
	{
		Object retObject;
		try
		{
			Session session = getSessionFactory().getCurrentSession();
			retObject = session.save(object);
			session.flush();
		}
		catch (PersistenceException exception)
		{
			throw new PersistenceException(exception);
		}
		return retObject;
	}

}
