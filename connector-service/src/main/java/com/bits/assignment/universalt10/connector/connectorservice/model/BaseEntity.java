/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.model;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * @author Vicky
 *
 */
public abstract class BaseEntity {

	@Id
	private String id;

	@CreatedDate
	private Date createdAt;

	@LastModifiedDate
	private Date lastModifiedAt;

	@CreatedBy
	private String createdBy;

	@LastModifiedBy
	private String LastModifiedBy;

	private String deviceId;

	private String deviceSno;

	private String patientId;

	private String patientName;

	private String patientGender;

	private int age;

	private double height;

	private double weight;

	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceSno() {
		return deviceSno;
	}

	public void setDeviceSno(String deviceSno) {
		this.deviceSno = deviceSno;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}

	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedBy() {
		return LastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		LastModifiedBy = lastModifiedBy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(LastModifiedBy, createdAt, createdBy, id, lastModifiedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		return Objects.equals(LastModifiedBy, other.LastModifiedBy) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(createdBy, other.createdBy) && Objects.equals(id, other.id)
				&& Objects.equals(lastModifiedAt, other.lastModifiedAt);
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", createdAt=" + createdAt + ", lastModifiedAt=" + lastModifiedAt
				+ ", createdBy=" + createdBy + ", LastModifiedBy=" + LastModifiedBy + "]";
	}

}
