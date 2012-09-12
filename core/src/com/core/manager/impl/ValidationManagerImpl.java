package com.core.manager.impl;

import java.util.Map;

import com.api.exceptions.ValidationException;
import com.api.managers.ResourceManager;
import com.api.managers.ValidationManager;

// TODO: Auto-generated Javadoc
/**
 * The Class ValidationManagerImpl.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public class ValidationManagerImpl implements ValidationManager
{

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

	/* (non-Javadoc)
	 * @see com.api.managers.ValidationManager#validateParameters(java.util.Map)
	 */
	@Override
	public void validateParameters(Map<String, String> params) throws ValidationException
	{
		// TODO Auto-generated method stub

	}

}
