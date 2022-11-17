/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bits.assignment.universalt10.connector.connectorservice.model.Temperature;

/**
 * @author Vicky
 *
 */
@Repository
public interface TemperatureRepository extends MongoRepository<Temperature, String> {

	List<Temperature> findByPatientId(String patientId);

	List<Temperature> findByPatientName(String patientName);

}
