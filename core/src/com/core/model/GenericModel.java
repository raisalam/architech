package com.core.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

// TODO: Auto-generated Javadoc
/**
 * The Class GenericModel.
 *
 * @author Rais Alam
 * @date Sep 12, 2012
 */
@MappedSuperclass
public abstract class GenericModel implements Serializable
{

	/** The id. */
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	/** The version. */
	@Version
	@Column(name = "VERSION")
	private Long version;

	/** The creation date. */
	@Column(name = "CREATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar creationDate;

	/** The updation date. */
	@Column(name = "UPDATION_DATE ")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar updationDate;


	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public Long getVersion()
	{
		return version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(Long version)
	{
		this.version = version;
	}

	/**
	 * Gets the creation date.
	 *
	 * @return the creation date
	 */
	public Calendar getCreationDate()
	{
		return creationDate;
	}

	/**
	 * Sets the creation date.
	 *
	 * @param creationDate the new creation date
	 */
	public void setCreationDate(Calendar creationDate)
	{
		this.creationDate = creationDate;
	}

	/**
	 * Gets the updation date.
	 *
	 * @return the updation date
	 */
	public Calendar getUpdationDate()
	{
		return updationDate;
	}

	/**
	 * Sets the updation date.
	 *
	 * @param updationDate the new updation date
	 */
	public void setUpdationDate(Calendar updationDate)
	{
		this.updationDate = updationDate;
	}

}
