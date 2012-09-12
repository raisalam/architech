package com.core.dao;

import com.api.exceptions.PersistenceException;
import com.core.model.User;

public interface UserDAO
{
	public Long registerUser(User user) throws PersistenceException;

}
