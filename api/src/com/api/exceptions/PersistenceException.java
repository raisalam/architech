package com.api.exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class PersistenceException.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public class PersistenceException extends SystemException
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new persistence exception.
	 *
	 * @param exception the exception
	 */
	public PersistenceException(Exception exception)
	{
		super(exception);
	}

	/**
	 * Instantiates a new persistence exception.
	 *
	 * @param message the message
	 */
	public PersistenceException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new persistence exception.
	 *
	 * @param message the message
	 * @param e the e
	 */
	public PersistenceException(String message, Exception e)
	{
		super(message);
	}

}
