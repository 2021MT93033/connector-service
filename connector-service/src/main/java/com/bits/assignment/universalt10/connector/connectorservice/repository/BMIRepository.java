/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bits.assignment.universalt10.connector.connectorservice.model.BMI;

/**
 * @author Vicky
 *
 */
@Repository
public interface BMIRepository extends MongoRepository<BMI, String> {

	List<BMI> findByPatientId(String patientId);

	List<BMI> findByPatientName(String patientName);

}
