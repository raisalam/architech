package com.api.managers;

import com.api.exceptions.ValidationException;
import com.api.vos.UserVO;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserManager.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public interface UserManager
{

	/**
	 * Register user.
	 *
	 * @param userVO the user vo
	 * @return the long
	 * @throws ValidationException the validation exception
	 */
	public Long registerUser(final UserVO userVO) throws ValidationException;

}
