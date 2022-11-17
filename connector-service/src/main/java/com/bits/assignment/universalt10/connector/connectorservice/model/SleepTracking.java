/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.model;

import java.util.Date;
import java.util.Objects;

/**
 * @author Vicky
 *
 */
public class SleepTracking extends BaseEntity {

	private Date startAt;
	private Date endAt;
	private int deepSleepHours;

	public SleepTracking() {

	}

	/**
	 * @param startAt
	 * @param endAt
	 * @param deepSleepHours
	 */
	public SleepTracking(Date startAt, Date endAt, int deepSleepHours) {
		super();
		this.startAt = startAt;
		this.endAt = endAt;
		this.deepSleepHours = deepSleepHours;
	}

	/**
	 * @return the startAt
	 */
	public Date getStartAt() {
		return startAt;
	}

	/**
	 * @param startAt the startAt to set
	 */
	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	/**
	 * @return the endAt
	 */
	public Date getEndAt() {
		return endAt;
	}

	/**
	 * @param endAt the endAt to set
	 */
	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}

	/**
	 * @return the deepSleepHours
	 */
	public int getDeepSleepHours() {
		return deepSleepHours;
	}

	/**
	 * @param deepSleepHours the deepSleepHours to set
	 */
	public void setDeepSleepHours(int deepSleepHours) {
		this.deepSleepHours = deepSleepHours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(deepSleepHours, endAt, startAt);
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
		if (!(obj instanceof SleepTracking)) {
			return false;
		}
		SleepTracking other = (SleepTracking) obj;
		return deepSleepHours == other.deepSleepHours && Objects.equals(endAt, other.endAt)
				&& Objects.equals(startAt, other.startAt);
	}

	@Override
	public String toString() {
		return "SleepTracking [startAt=" + startAt + ", endAt=" + endAt + ", deepSleepHours=" + deepSleepHours + "]";
	}

}
