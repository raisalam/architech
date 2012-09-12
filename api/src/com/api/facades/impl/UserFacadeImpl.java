package com.api.facades.impl;

import com.api.exceptions.FacadeException;
import com.api.facades.UserFacade;
import com.api.vos.UserVO;

// TODO: Auto-generated Javadoc
/**
 * The Class UserFacadeImpl.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public class UserFacadeImpl extends BaseFacade implements UserFacade
{

	/* (non-Javadoc)
	 * @see com.api.facades.UserFacade#registerUser(com.api.vos.UserVO)
	 */
	@Override
	public Long registerUser(final UserVO userVO) throws FacadeException
	{
		Long savedUserId = null;

		try
		{
			return savedUserId = getUserManager().registerUser(userVO);

		}
		catch (Throwable throwable)
		{
			handleException(throwable);

		}
		return savedUserId;

	}

}
