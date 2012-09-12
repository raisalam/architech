package com.core.manager.impl;

import com.api.managers.ResourceManager;
import com.api.managers.ValidationManager;
import com.core.dao.UserDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseManager.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public abstract class BaseManager
{
	
	/** The user dao. */
	private UserDAO userDAO;

	/** The validation manager. */
	private ValidationManager validationManager;

	/** The resource manager. */
	private ResourceManager resourceManager;

	/**
	 * Gets the resource manager.
	 *
	 * @return the resource manager
	 */
	public ResourceManager getResourceManager()
	{
		return resourceManager;
	}

	/**
	 * Sets the resource manager.
	 *
	 * @param resourceManager the new resource manager
	 */
	public void setResourceManager(ResourceManager resourceManager)
	{
		this.resourceManager = resourceManager;
	}

	/**
	 * Gets the user dao.
	 *
	 * @return the user dao
	 */
	public UserDAO getUserDAO()
	{
		return userDAO;
	}

	/**
	 * Sets the user dao.
	 *
	 * @param userDAO the new user dao
	 */
	public void setUserDAO(UserDAO userDAO)
	{
		this.userDAO = userDAO;
	}

	/**
	 * Gets the validation manager.
	 *
	 * @return the validation manager
	 */
	public ValidationManager getValidationManager()
	{
		return validationManager;
	}

	/**
	 * Sets the validation manager.
	 *
	 * @param validationManager the new validation manager
	 */
	public void setValidationManager(ValidationManager validationManager)
	{
		this.validationManager = validationManager;
	}

}
