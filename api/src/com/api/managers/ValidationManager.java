package com.api.managers;

import java.util.Map;

import com.api.constants.ValidationConstants;
import com.api.exceptions.ValidationException;

// TODO: Auto-generated Javadoc
/**
 * The Interface ValidationManager.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public interface ValidationManager extends ValidationConstants
{
	
	/**
	 * Validate parameters.
	 *
	 * @param params the params
	 * @throws ValidationException the validation exception
	 */
	public void validateParameters(Map<String, String> params) throws ValidationException;

}
