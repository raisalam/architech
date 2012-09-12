package com.api.exceptions;

public class FacadeException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1141777051696763825L;

	/** The error message. */
	private String errorMessage;

	/** The error place. */
	private String errorPlace;

	/** The system error. */
	private String systemError;

	/**
	 * Instantiates a new facade exception.
	 * 
	 * @param exception
	 *            the exception
	 */
	public FacadeException(Exception exception)
	{
		super(exception);
		this.errorMessage = exception.getMessage();

	}

	/**
	 * Instantiates a new facade exception.
	 * 
	 * @param message
	 *            the message
	 * @param e
	 *            the e
	 */
	public FacadeException(String message, Exception e)
	{
		super(message, e);
		{
			if (message != null)
			{
				String[] arr = message.split("=>");
				if (arr != null && arr.length >= 3)
				{
					this.errorPlace = arr[0];
					this.errorMessage = arr[1];
					this.systemError = arr[2];

				}
			}
		}

	}

	/**
	 * Instantiates a new facade exception.
	 * 
	 * @param message
	 *            the message
	 */
	public FacadeException(String message)
	{
		super(message);
		if (message != null)
		{
			String[] arr = message.split("=>");
			if (arr != null && arr.length >= 3)
			{
				this.errorPlace = arr[0];
				this.errorMessage = arr[1];
				this.systemError = arr[2];

			}
		}
	}

	/**
	 * Gets the error message.
	 * 
	 * @return the error message
	 */
	public String getErrorMessage()
	{
		return errorMessage;
	}

	/**
	 * Sets the error message.
	 * 
	 * @param errorMessage
	 *            the new error message
	 */
	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}

	/**
	 * Gets the error place.
	 * 
	 * @return the error place
	 */
	public String getErrorPlace()
	{
		return errorPlace;
	}

	/**
	 * Sets the error place.
	 * 
	 * @param errorPlace
	 *            the new error place
	 */
	public void setErrorPlace(String errorPlace)
	{
		this.errorPlace = errorPlace;
	}

	/**
	 * Gets the system error.
	 * 
	 * @return the system error
	 */
	public String getSystemError()
	{
		return systemError;
	}

	/**
	 * Sets the system error.
	 * 
	 * @param systemError
	 *            the new system error
	 */
	public void setSystemError(String systemError)
	{
		this.systemError = systemError;
	}

}
