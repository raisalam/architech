package com.api.facades.impl;

import org.apache.log4j.Logger;

import com.api.exceptions.ApplicationException;
import com.api.exceptions.FacadeException;
import com.api.exceptions.LookUpException;
import com.api.exceptions.ModificationException;
import com.api.exceptions.PersistenceException;
import com.api.exceptions.SystemException;
import com.api.managers.UserManager;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseFacade.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public abstract class BaseFacade extends ProjectFacade
{

	/** The Constant logger. */
	private final static Logger logger = Logger.getLogger(BaseFacade.class);

	/** The user manager. */
	private UserManager userManager;

	/**
	 * Handle exception.
	 *
	 * @param throwable the throwable
	 * @throws FacadeException the facade exception
	 */
	public void handleException(Throwable throwable) throws FacadeException
	{
		logger.info("Going to handle exception :: " + throwable.getMessage());
		if (throwable instanceof SystemException)
		{
			logger.info("System exception  :: " + throwable.getMessage());
			handleSystemException((SystemException) throwable);
		}

		else if (throwable instanceof ApplicationException)
		{
			logger.info("Application exception  :: " + throwable.getMessage());
			handleApplicationException((ApplicationException) throwable);
		}
		else
		{
			handleUnknownException(throwable);
		}
	}

	/**
	 * Handle application exception.
	 *
	 * @param applicationException the application exception
	 * @throws FacadeException the facade exception
	 */
	private void handleApplicationException(ApplicationException applicationException) throws FacadeException
	{
		throw applicationException;

	}

	/**
	 * Handle system exception.
	 *
	 * @param systemException the system exception
	 * @throws FacadeException the facade exception
	 */
	public void handleSystemException(SystemException systemException) throws FacadeException
	{
		if (systemException instanceof PersistenceException)
		{

			/**
			 * Handle Persistence Exception according to business requirement 1)
			 * You can log the error message. 2) You can print the error
			 * message. 3) Mail and notify to appropriate administer to resolve
			 * the problem.
			 */
			throw new FacadeException(systemException.getMessage());
		}
		else if (systemException instanceof LookUpException)
		{
			/**
			 * Handle lookup exception according to business requirement 1) You
			 * can log the error message. 2) You can print the error message. 3)
			 * Mail and notify to appropriate administer to resolve the problem.
			 */
			throw new FacadeException(systemException.getMessage());
		}
		else if (systemException instanceof ModificationException)
		{
			/**
			 * Handle Modification Exception according to business requirement
			 * 1) You can log the error message. 2) You can print the error
			 * message. 3) Mail and notify to appropriate administer to resolve
			 * the problem.
			 */
			throw new FacadeException(systemException.getMessage());
		}

		logger.error(systemException.getErrorMessage());
		logger.error(systemException.getErrorPlace());
		logger.error(systemException.getSystemError());
	}

	/**
	 * Handle unknown exception.
	 *
	 * @param throwable the throwable
	 * @throws FacadeException the facade exception
	 */
	public void handleUnknownException(Throwable throwable) throws FacadeException
	{
		System.out.println("Error is === " + throwable.getMessage());
		// logger.info();
		throw new FacadeException(throwable.getMessage());
	}

	/**
	 * Gets the user manager.
	 *
	 * @return the user manager
	 */
	public UserManager getUserManager()
	{
		if (userManager == null)
		{
			userManager = (UserManager) getBean("userManager");
		}
		return userManager;
	}
}
