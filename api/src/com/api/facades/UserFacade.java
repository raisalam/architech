package com.api.facades;

import com.api.exceptions.FacadeException;
import com.api.vos.UserVO;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserFacade.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public interface UserFacade
{

	/**
	 * Register user.
	 *
	 * @param userVO the user vo
	 * @return the long
	 * @throws FacadeException the facade exception
	 */
	public Long registerUser(final UserVO userVO) throws FacadeException;

}
