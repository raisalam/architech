package com.api.vos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ValidationError
{
	private String _errorMessage;
	private String _fieldName;

	public ValidationError()
	{
		// TODO Auto-generated constructor stub
	}

	public ValidationError(String errorMessage, String fieldName)
	{
		this._errorMessage = errorMessage;
		this._fieldName = fieldName;
	}

	public String getErrorMessage()
	{
		return _errorMessage;
	}

	public void setErrorMessage(String errorMessage)
	{
		this._errorMessage = errorMessage;
	}

	public String getFieldName()
	{
		return _fieldName;
	}

	public void setFieldName(String fieldName)
	{
		this._fieldName = fieldName;
	}

	@Override
	public String toString()
	{
		return "ValidationError [_errorMessage=" + _errorMessage + ", _fieldName=" + _fieldName + "]";
	}
}