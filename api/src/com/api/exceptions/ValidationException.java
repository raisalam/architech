package com.api.exceptions;

import java.util.List;
import java.util.Map;

import com.api.vos.ValidationError;

public class ValidationException extends ApplicationException
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The errors. */
	private Map<String, String> errors;

	/** The validation errors. */
	private List<ValidationError> validationErrors;

	/**
	 * Gets the errors.
	 *
	 * @return the errors
	 */
	public Map<String, String> getErrors()
	{
		return errors;
	}

	/**
	 * Sets the errors.
	 *
	 * @param errors the errors
	 */
	public void setErrors(Map<String, String> errors)
	{
		this.errors = errors;
	}

	/**
	 * Instantiates a new validation exception.
	 *
	 * @param errorMsg the error msg
	 */
	public ValidationException(String errorMsg)
	{
		super(errorMsg);
	}

	/**
	 * Instantiates a new validation exception.
	 *
	 * @param validationErrors the validation errors
	 */
	public ValidationException(List<ValidationError> validationErrors)
	{
		super("");
		this.validationErrors = validationErrors;
	}

	/**
	 * Instantiates a new validation exception.
	 *
	 * @param errorMsg the error msg
	 * @param errors the errors
	 */
	public ValidationException(String errorMsg, Map<String, String> errors)
	{
		super(errorMsg);
		this.errors = errors;
	}

	/**
	 * Gets the validation errors.
	 *
	 * @return the validation errors
	 */
	public List<ValidationError> getValidationErrors()
	{
		return validationErrors;
	}


}
