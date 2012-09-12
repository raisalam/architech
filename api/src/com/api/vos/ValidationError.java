package com.api.vos;

import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * The Class ValidationError.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
@XmlRootElement
public class ValidationError
{
	
	/** The _error message. */
	private String _errorMessage;
	
	/** The _field name. */
	private String _fieldName;

	/**
	 * Instantiates a new validation error.
	 */
	public ValidationError()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new validation error.
	 *
	 * @param errorMessage the error message
	 * @param fieldName the field name
	 */
	public ValidationError(String errorMessage, String fieldName)
	{
		this._errorMessage = errorMessage;
		this._fieldName = fieldName;
	}

	/**
	 * Gets the error message.
	 *
	 * @return the error message
	 */
	public String getErrorMessage()
	{
		return _errorMessage;
	}

	/**
	 * Sets the error message.
	 *
	 * @param errorMessage the new error message
	 */
	public void setErrorMessage(String errorMessage)
	{
		this._errorMessage = errorMessage;
	}

	/**
	 * Gets the field name.
	 *
	 * @return the field name
	 */
	public String getFieldName()
	{
		return _fieldName;
	}

	/**
	 * Sets the field name.
	 *
	 * @param fieldName the new field name
	 */
	public void setFieldName(String fieldName)
	{
		this._fieldName = fieldName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "ValidationError [_errorMessage=" + _errorMessage + ", _fieldName=" + _fieldName + "]";
	}

	
}