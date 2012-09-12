package com.api.vos;

// TODO: Auto-generated Javadoc
/**
 * The Class UserVO.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public class UserVO
{

	/** The user email. */
	private String userEmail;
	
	/** The user password. */
	private String userPassword;
	
	/** The user first name. */
	private String userFirstName;
	
	/** The user last name. */
	private String userLastName;
	
	/** The user phone. */
	private String userPhone;

	/**
	 * Gets the user email.
	 *
	 * @return the user email
	 */
	public String getUserEmail()
	{
		return userEmail;
	}

	/**
	 * Sets the user email.
	 *
	 * @param userEmail the new user email
	 */
	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}

	/**
	 * Gets the user password.
	 *
	 * @return the user password
	 */
	public String getUserPassword()
	{
		return userPassword;
	}

	/**
	 * Sets the user password.
	 *
	 * @param userPassword the new user password
	 */
	public void setUserPassword(String userPassword)
	{
		this.userPassword = userPassword;
	}

	/**
	 * Gets the user first name.
	 *
	 * @return the user first name
	 */
	public String getUserFirstName()
	{
		return userFirstName;
	}

	/**
	 * Sets the user first name.
	 *
	 * @param userFirstName the new user first name
	 */
	public void setUserFirstName(String userFirstName)
	{
		this.userFirstName = userFirstName;
	}

	/**
	 * Gets the user last name.
	 *
	 * @return the user last name
	 */
	public String getUserLastName()
	{
		return userLastName;
	}

	/**
	 * Sets the user last name.
	 *
	 * @param userLastName the new user last name
	 */
	public void setUserLastName(String userLastName)
	{
		this.userLastName = userLastName;
	}

	/**
	 * Gets the user phone.
	 *
	 * @return the user phone
	 */
	public String getUserPhone()
	{
		return userPhone;
	}

	/**
	 * Sets the user phone.
	 *
	 * @param userPhone the new user phone
	 */
	public void setUserPhone(String userPhone)
	{
		this.userPhone = userPhone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "UserVO [userEmail=" + userEmail + ", userPassword=" + userPassword + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userPhone=" + userPhone + "]";
	}

}
