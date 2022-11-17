/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.model;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Vicky
 *
 */
@Document
public class Temperature extends BaseEntity {

	private String value;

	public Temperature() {

	}

	/**
	 * @param value
	 */
	public Temperature(String value) {
		super();
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(value);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Temperature)) {
			return false;
		}
		Temperature other = (Temperature) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "Temperature [value=" + value + "]";
	}

}
