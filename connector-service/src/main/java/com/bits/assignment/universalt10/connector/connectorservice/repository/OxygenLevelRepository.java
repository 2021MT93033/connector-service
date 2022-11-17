/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bits.assignment.universalt10.connector.connectorservice.model.OxygenLevel;

/**
 * @author Vicky
 *
 */
@Repository
public interface OxygenLevelRepository extends MongoRepository<OxygenLevel, String> {

	List<OxygenLevel> findByPatientId(String patientId);

	List<OxygenLevel> findByPatientName(String patientName);

}
