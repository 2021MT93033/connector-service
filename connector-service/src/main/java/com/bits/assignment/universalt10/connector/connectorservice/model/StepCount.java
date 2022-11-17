/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.model;

import java.util.Objects;

/**
 * @author Vicky
 *
 */
public class StepCount extends BaseEntity {

	private String value;

	public StepCount() {

	}

	/**
	 * @param value
	 */
	public StepCount(String value) {
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
		if (!(obj instanceof StepCount)) {
			return false;
		}
		StepCount other = (StepCount) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "StepCount [value=" + value + "]";
	}

}
