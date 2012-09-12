package com.core.dao.impl;

import org.hibernate.HibernateException;

import com.api.exceptions.LookUpException;
import com.api.exceptions.PersistenceException;
import com.core.dao.UserDAO;
import com.core.model.User;

// TODO: Auto-generated Javadoc
/**
 * The Class UserDAOImpl.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public class UserDAOImpl extends BaseDao implements UserDAO
{

	/* (non-Javadoc)
	 * @see com.core.dao.UserDAO#registerUser(com.core.model.User)
	 */
	@Override
	public Long registerUser(User user) throws PersistenceException
	{
		try
		{
			return (Long) super.save(user);
		}
		catch (HibernateException e)
		{
			String message = "Problem occurred while persisting the User " + e.getMessage();
			throw new LookUpException(message, e);
		}

	}

}
