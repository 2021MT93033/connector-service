/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.service;

import java.util.List;

import com.bits.assignment.universalt10.connector.connectorservice.model.BMI;
import com.bits.assignment.universalt10.connector.connectorservice.model.BloodPressure;
import com.bits.assignment.universalt10.connector.connectorservice.model.OxygenLevel;
import com.bits.assignment.universalt10.connector.connectorservice.model.SleepTracking;
import com.bits.assignment.universalt10.connector.connectorservice.model.StepCount;
import com.bits.assignment.universalt10.connector.connectorservice.model.Temperature;

/**
 * @author Vicky
 *
 */
public interface ConnectorService {

	public BloodPressure createBloodPressureRecord(BloodPressure bloodPressure);

	public BloodPressure updateBloodPressureRecord(BloodPressure bloodPressure, String id) throws Exception;

	public List<BloodPressure> getLatestBloodPressureRecordByPatientId(String patientId);

	public List<BloodPressure> getLatestBloodPressureRecordByPatientName(String patientName);

	public List<BloodPressure> getAllBloodPressureRecords();

	public BMI createBMIRecord(BMI bmi);

	public BMI getBMIRecordById(String id);

	public List<BMI> getLatestBMIRecordByPatientId(String patientId);

	public List<BMI> getLatestBMIRecordByPatientName(String patientName);

	public List<BMI> getAllBMIRecords();

	public OxygenLevel createOxygenLevelRecord(OxygenLevel oxyLevel);

	public OxygenLevel getOxygenLevelRecordById(String id);

	public List<OxygenLevel> getLatestOxygenLevelRecordByPatientId(String patientId);

	public List<OxygenLevel> getLatestOxygenLevelRecordByPatientName(String patientName);

	public List<OxygenLevel> getAllOxygenLevelRecords();

	public void sendData(String patientId);

	public SleepTracking createSleepTrackingRecord(SleepTracking sleepTracking);

	public SleepTracking getSleepTrackingRecordById(String id);

	public List<SleepTracking> getLatestSleepTrackingRecordByPatientId(String patientId);

	public List<SleepTracking> getLatestSleepTrackingRecordByPatientName(String patientName);

	public List<SleepTracking> getAllSleepTrackingRecords();

	public StepCount createStepCountRecord(StepCount stepCount);

	public StepCount getStepCountRecordById(String id);

	public List<StepCount> getLatestStepCountRecordByPatientId(String patientId);

	public List<StepCount> getLatestStepCountRecordByPatientName(String patientName);

	public List<StepCount> getAllStepCountRecords();

	public Temperature createTemperatureRecord(Temperature temperature);

	public Temperature getTemperatureRecordById(String id);

	public List<Temperature> getLatestTemperatureRecordByPatientId(String patientId);

	public List<Temperature> getLatestTemperatureRecordByPatientName(String patientName);

	public List<Temperature> getAllTemperatureRecords();

	public BloodPressure getBloodPressureRecordById(String id);

	public BMI updateBMIRecord(BMI bmi, String id) throws Exception;

	public OxygenLevel updateOxygenLevelRecord(OxygenLevel oxygenLevel, String id) throws Exception;

	public StepCount updateStepCountRecord(StepCount stepCount, String id) throws Exception;

	public SleepTracking updateSleepTrackingRecord(SleepTracking sleepTracking, String id) throws Exception;

	public Temperature updateTemperatureRecord(Temperature temperature, String id) throws Exception;

	public void deleteBloodPressureRecord(String id) throws Exception;

	public void deleteOxygenLevelRecord(String id) throws Exception;

	public void deleteBMIRecord(String id) throws Exception;

	public void deleteSleepTrackingRecord(String id) throws Exception;

	public void deleteStepCountRecord(String id) throws Exception;

	public void deleteTemperatureRecord(String id) throws Exception;

}
