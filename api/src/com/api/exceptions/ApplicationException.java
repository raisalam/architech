package com.api.exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationException.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public class ApplicationException extends FacadeException
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4240929255253664271L;

	/** The error message. */
	private String errorMessage;

	/** The error place. */
	private String errorPlace;

	/** The application error. */
	private String applicationError;

	/**
	 * Instantiates a new application exception.
	 *
	 * @param message the message
	 */
	public ApplicationException(String message)
	{
		super(message);
		if (message != null)
		{
			String[] arr = message.split("=>");
			if (arr != null)
			{
				if (arr.length == 2)
				{
					this.errorPlace = arr[0];
					this.errorMessage = arr[1];
				}
				else if (arr.length == 3)
				{
					this.errorPlace = arr[0];
					this.errorMessage = arr[1];
					this.applicationError = arr[2];

				}

			}
		}
	}

	/**
	 * Instantiates a new application exception.
	 *
	 * @param message the message
	 * @param e the e
	 */
	public ApplicationException(String message, Exception e)
	{
		super(message, e);
	}


	/* (non-Javadoc)
	 * @see com.api.exceptions.FacadeException#getErrorMessage()
	 */
	@Override
	public String getErrorMessage()
	{
		return errorMessage;
	}

	
	/* (non-Javadoc)
	 * @see com.api.exceptions.FacadeException#setErrorMessage(java.lang.String)
	 */
	@Override
	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}

	
	/* (non-Javadoc)
	 * @see com.api.exceptions.FacadeException#getErrorPlace()
	 */
	@Override
	public String getErrorPlace()
	{
		return errorPlace;
	}

	/* (non-Javadoc)
	 * @see com.api.exceptions.FacadeException#setErrorPlace(java.lang.String)
	 */
	@Override
	public void setErrorPlace(String errorPlace)
	{
		this.errorPlace = errorPlace;
	}

	/**
	 * Gets the application error.
	 *
	 * @return the application error
	 */
	public String getApplicationError()
	{
		return applicationError;
	}

	/**
	 * Sets the application error.
	 *
	 * @param applicationError the new application error
	 */
	public void setApplicationError(String applicationError)
	{
		this.applicationError = applicationError;
	}

}
