package com.core.manager.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.api.constants.ValidationConstants;
import com.api.exceptions.ValidationException;
import com.api.managers.UserManager;
import com.api.vos.UserVO;
import com.core.model.User;

// TODO: Auto-generated Javadoc
/**
 * The Class UserManagerImpl.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public class UserManagerImpl extends BaseManager implements UserManager
{

	/* (non-Javadoc)
	 * @see com.api.managers.UserManager#registerUser(com.api.vos.UserVO)
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Long registerUser(UserVO userVO) throws ValidationException
	{

		Map<String, String> params = new HashMap<String, String>();

		params.put(ValidationConstants.USER_EMAIL, userVO.getUserEmail());
		params.put(ValidationConstants.USER_PASSWORD, userVO.getUserPassword());
		params.put(ValidationConstants.USER_FIRSTNAME, userVO.getUserFirstName());
		params.put(ValidationConstants.USER_LASTNAME, userVO.getUserLastName());
		params.put(ValidationConstants.USER_PHONE, userVO.getUserPhone());

		getValidationManager().validateParameters(params);
		getUserDAO().registerUser(mapUserVOToUser(userVO));

		return null;
	}

	/**
	 * Map user vo to user.
	 *
	 * @param userVO the user vo
	 * @return the user
	 */
	public User mapUserVOToUser(UserVO userVO)
	{
		User user = null;
		if (userVO != null)
		{
			user = new User();
			user.setUserEmail(userVO.getUserEmail());
			user.setUserPassword(userVO.getUserPassword());
			user.setUserFirstName(userVO.getUserFirstName());
			user.setUserLastName(userVO.getUserLastName());
			user.setUserPhone(userVO.getUserPhone());
		}
		return user;

	}
}
