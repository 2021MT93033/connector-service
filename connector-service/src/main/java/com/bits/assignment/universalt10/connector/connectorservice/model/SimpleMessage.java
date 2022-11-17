/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.model;

import java.util.Objects;

/**
 * @author Vicky
 *
 */
public class SimpleMessage {

	private String message;

	public SimpleMessage() {

	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param message
	 */
	public SimpleMessage(String message) {
		super();
		this.message = message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(message);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SimpleMessage)) {
			return false;
		}
		SimpleMessage other = (SimpleMessage) obj;
		return Objects.equals(message, other.message);
	}

	@Override
	public String toString() {
		return "SimpleMessage [message=" + message + "]";
	}

}
