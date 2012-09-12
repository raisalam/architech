package com.api.facade.test;

import org.junit.Test;

import com.api.facades.impl.ProjectFacade;
import com.api.vos.UserVO;

// TODO: Auto-generated Javadoc
/**
 * The Class TestUserFacade.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public class TestUserFacade
{

	/**
	 * Test register user1.
	 */
	@Test
	public void testRegisterUser1()
	{
		try
		{
			UserVO userVO = new UserVO();
			userVO.setUserEmail("rais7jmi@gmail.com");
			userVO.setUserPassword("password");
			userVO.setUserFirstName("Rais");
			userVO.setUserLastName("Alam");
			userVO.setUserPhone("9911449662");
			ProjectFacade.user().registerUser(userVO);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
