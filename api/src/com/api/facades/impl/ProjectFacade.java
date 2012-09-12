package com.api.facades.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.api.facades.UserFacade;
import com.api.managers.ResourceManager;

// TODO: Auto-generated Javadoc
/**
 * The Class ProjectFacade.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public abstract class ProjectFacade
{

	/** The application context. */
	private static ApplicationContext applicationContext;

	static
	{
		applicationContext = new ClassPathXmlApplicationContext(new String[] { "classpath:/com/api/contexts/core-appcontext.xml" }, true);
	}

	/**
	 * User.
	 *
	 * @return the user facade
	 */
	public static UserFacade user()
	{
		return new UserFacadeImpl();
	}

	/**
	 * Resource manager.
	 *
	 * @return the resource manager
	 */
	public static ResourceManager resourceManager()
	{
		return (ResourceManager) getBean("resourceManager");
	}

	/**
	 * Gets the bean.
	 *
	 * @param beanId the bean id
	 * @return the bean
	 */
	public static Object getBean(String beanId)
	{

		return applicationContext.getBean(beanId);
	}
}
