/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bits.assignment.universalt10.connector.connectorservice.model.BloodPressure;

/**
 * @author Vicky
 *
 */
@Repository
public interface BloodPressureRepository extends MongoRepository<BloodPressure, String> {

	List<BloodPressure> findByPatientId(String patientId);

	List<BloodPressure> findByPatientName(String patientName);

}
