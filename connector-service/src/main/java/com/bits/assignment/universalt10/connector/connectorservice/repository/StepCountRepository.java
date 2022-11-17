/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bits.assignment.universalt10.connector.connectorservice.model.StepCount;

/**
 * @author Vicky
 *
 */
@Repository
public interface StepCountRepository extends MongoRepository<StepCount, String> {

	List<StepCount> findByPatientId(String patientId);

	List<StepCount> findByPatientName(String patientName);

}
