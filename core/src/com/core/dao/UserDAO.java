package com.core.dao;

import com.api.exceptions.PersistenceException;
import com.core.model.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserDAO.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public interface UserDAO
{
	
	/**
	 * Register user.
	 *
	 * @param user the user
	 * @return the long
	 * @throws PersistenceException the persistence exception
	 */
	public Long registerUser(User user) throws PersistenceException;

}
