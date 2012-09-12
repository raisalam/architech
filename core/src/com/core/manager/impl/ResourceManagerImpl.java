package com.core.manager.impl;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import com.api.managers.ResourceManager;

// TODO: Auto-generated Javadoc
/**
 * The Class ResourceManagerImpl.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public class ResourceManagerImpl implements ResourceManager, MessageSourceAware
{
	
	/** The message source. */
	private MessageSource messageSource;

	/* (non-Javadoc)
	 * @see org.springframework.context.MessageSourceAware#setMessageSource(org.springframework.context.MessageSource)
	 */
	public void setMessageSource(MessageSource messageSource)
	{
		this.messageSource = messageSource;
	}

	/* (non-Javadoc)
	 * @see com.api.managers.ResourceManager#getValue(java.lang.String)
	 */
	@Override
	public String getValue(String key)
	{
		try
		{

			return messageSource.getMessage(key, null, Locale.getDefault());
		}
		catch (Exception e)
		{
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see com.api.managers.ResourceManager#getValue(java.lang.String, java.lang.String)
	 */
	@Override
	public String getValue(String key, String defaultString)
	{
		try
		{

			return messageSource.getMessage(key, null, Locale.getDefault());
		}
		catch (Exception e)
		{
			return defaultString;
		}
	}

	/* (non-Javadoc)
	 * @see com.api.managers.ResourceManager#getValue(java.lang.String, java.lang.Object[])
	 */
	@Override
	public String getValue(String key, Object obj[])
	{
		try
		{

			return messageSource.getMessage(key, obj, Locale.getDefault());
		}
		catch (Exception e)
		{
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see com.api.managers.ResourceManager#getValue(java.lang.String, java.lang.Object[], java.lang.String)
	 */
	@Override
	public String getValue(String key, Object[] obj, String defaultValue)
	{
		try
		{

			return messageSource.getMessage(key, obj, Locale.getDefault());
		}
		catch (Exception e)
		{
			return defaultValue;
		}
	}

}
