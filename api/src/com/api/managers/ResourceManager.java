package com.api.managers;

// TODO: Auto-generated Javadoc
/**
 * The Interface ResourceManager.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
public interface ResourceManager
{

	/**
	 * Gets the value.
	 *
	 * @param key the key
	 * @return the value
	 */
	public String getValue(String key);

	/**
	 * Gets the value.
	 *
	 * @param key the key
	 * @param defaultString the default string
	 * @return the value
	 */
	public String getValue(String key, String defaultString);

	/**
	 * Gets the value.
	 *
	 * @param key the key
	 * @param obj the obj
	 * @return the value
	 */
	public String getValue(String key, Object[] obj);

	/**
	 * Gets the value.
	 *
	 * @param key the key
	 * @param obj the obj
	 * @param defaultValue the default value
	 * @return the value
	 */
	public String getValue(String key, Object[] obj, String defaultValue);

}
