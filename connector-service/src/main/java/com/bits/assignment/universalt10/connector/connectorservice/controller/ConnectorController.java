/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.assignment.universalt10.connector.connectorservice.model.BMI;
import com.bits.assignment.universalt10.connector.connectorservice.model.BloodPressure;
import com.bits.assignment.universalt10.connector.connectorservice.model.OxygenLevel;
import com.bits.assignment.universalt10.connector.connectorservice.model.SleepTracking;
import com.bits.assignment.universalt10.connector.connectorservice.model.StepCount;
import com.bits.assignment.universalt10.connector.connectorservice.model.Temperature;
import com.bits.assignment.universalt10.connector.connectorservice.service.ConnectorService;

/**
 * @author Vicky
 *
 */
@RestController
public class ConnectorController {

	@Autowired
	private ConnectorService service;

	// Ping Check
	@GetMapping("/health")
	public ResponseEntity<?> getHealthOfTheService() {
		return ResponseEntity.ok(new SimpleMessage("The Service is Functioning"));
	}

	@PostMapping("/monitor")
	public ResponseEntity<?> processPatientReport() throws InterruptedException {
		Thread.sleep(10);
		return ResponseEntity.ok(new SimpleMessage("The Report is generated and sent to the doctor for review"));
	}

	// GET - ALL

	@GetMapping("/bloodPressure")
	public ResponseEntity<List<BloodPressure>> getAllBloodPressureRecords() {

		return ResponseEntity.ok(service.getAllBloodPressureRecords());

	}

	@GetMapping("/bmi")
	public ResponseEntity<List<BMI>> getAllBmiRecords() {

		return ResponseEntity.ok(service.getAllBMIRecords());

	}

	@GetMapping("/oxygenLevel")
	public ResponseEntity<List<OxygenLevel>> getAllOxygenLevelRecords() {

		return ResponseEntity.ok(service.getAllOxygenLevelRecords());

	}

	@GetMapping("/sleepTracking")
	public ResponseEntity<List<SleepTracking>> getAllSleepTrackingRecords() {

		return ResponseEntity.ok(service.getAllSleepTrackingRecords());

	}

	@GetMapping("/stepCount")
	public ResponseEntity<List<StepCount>> getAllStepCountRecords() {

		return ResponseEntity.ok(service.getAllStepCountRecords());

	}

	@GetMapping("/temperature")
	public ResponseEntity<List<Temperature>> getAllTemperatureRecords() {

		return ResponseEntity.ok(service.getAllTemperatureRecords());

	}

	// GET - BY ID

	@GetMapping("/bloodPressure/{id}")
	public ResponseEntity<BloodPressure> getBloodPressurebyId(@PathVariable String id) throws Exception {
		BloodPressure bloodPressure = service.getBloodPressureRecordById(id);
		if (bloodPressure == null) {
			throw new Exception("BloodPressure Record was not found");
		}
		return ResponseEntity.ok(bloodPressure);
	}

	@GetMapping("/bmi/{id}")
	public ResponseEntity<BMI> getBMIbyId(@PathVariable String id) throws Exception {
		BMI bmi = service.getBMIRecordById(id);
		if (bmi == null) {
			throw new Exception("BMI Record was not found");
		}
		return ResponseEntity.ok(bmi);
	}

	@GetMapping("/oxygenLevel/{id}")
	public ResponseEntity<OxygenLevel> getOxygenLevelbyId(@PathVariable String id) throws Exception {
		OxygenLevel oxygenLevel = service.getOxygenLevelRecordById(id);
		if (oxygenLevel == null) {
			throw new Exception("OxygenLevel Record was not found");
		}
		return ResponseEntity.ok(oxygenLevel);
	}

	@GetMapping("/sleepTracking/{id}")
	public ResponseEntity<SleepTracking> getSleepTrackingbyId(@PathVariable String id) throws Exception {
		SleepTracking sleepTracking = service.getSleepTrackingRecordById(id);
		if (sleepTracking == null) {
			throw new Exception("SleepTracking Record was not found");
		}
		return ResponseEntity.ok(sleepTracking);
	}

	@GetMapping("/stepCount/{id}")
	public ResponseEntity<StepCount> getStepCountbyId(@PathVariable String id) throws Exception {
		StepCount stepCount = service.getStepCountRecordById(id);
		if (stepCount == null) {
			throw new Exception("StepCount Record was not found");
		}
		return ResponseEntity.ok(stepCount);
	}

	@GetMapping("/temperature/{id}")
	public ResponseEntity<Temperature> getTemperaturebyId(@PathVariable String id) throws Exception {
		Temperature temperature = service.getTemperatureRecordById(id);
		if (temperature == null) {
			throw new Exception("BloodPressure Record was not found");
		}
		return ResponseEntity.ok(temperature);
	}

	// GET - BY Patient ID

	@GetMapping("/bloodPressure/{patientId}")
	public ResponseEntity<List<BloodPressure>> getBloodPressurebyPatientId(@PathVariable String patientId)
			throws Exception {
		List<BloodPressure> bloodPressure = service.getLatestBloodPressureRecordByPatientId(patientId);
		if (bloodPressure == null) {
			throw new Exception("BloodPressure Record was not found");
		}
		return ResponseEntity.ok(bloodPressure);
	}

	@GetMapping("/bmi/{patientId}")
	public ResponseEntity<List<BMI>> getBMIbyPatientId(@PathVariable String patientId) throws Exception {
		List<BMI> bmi = service.getLatestBMIRecordByPatientId(patientId);
		if (bmi == null) {
			throw new Exception("BMI Record was not found");
		}
		return ResponseEntity.ok(bmi);
	}

	@GetMapping("/oxygenLevel/{patientId}")
	public ResponseEntity<List<OxygenLevel>> getOxygenLevelbyPatientId(@PathVariable String patientId)
			throws Exception {
		List<OxygenLevel> oxygenLevel = service.getLatestOxygenLevelRecordByPatientId(patientId);
		if (oxygenLevel == null) {
			throw new Exception("OxygenLevel Record was not found");
		}
		return ResponseEntity.ok(oxygenLevel);
	}

	@GetMapping("/sleepTracking/{patientId}")
	public ResponseEntity<List<SleepTracking>> getSleepTrackingbyPatientId(@PathVariable String patientId)
			throws Exception {
		List<SleepTracking> sleepTracking = service.getLatestSleepTrackingRecordByPatientId(patientId);
		if (sleepTracking == null) {
			throw new Exception("SleepTracking Record was not found");
		}
		return ResponseEntity.ok(sleepTracking);
	}

	@GetMapping("/stepCount/{patientId}")
	public ResponseEntity<List<StepCount>> getStepCountbyPatientId(@PathVariable String patientId) throws Exception {
		List<StepCount> stepCount = service.getLatestStepCountRecordByPatientId(patientId);
		if (stepCount == null) {
			throw new Exception("StepCount Record was not found");
		}
		return ResponseEntity.ok(stepCount);
	}

	@GetMapping("/temperature/{patientId}")
	public ResponseEntity<List<Temperature>> getTemperaturebyPatientId(@PathVariable String patientId)
			throws Exception {
		List<Temperature> temperature = service.getLatestTemperatureRecordByPatientId(patientId);
		if (temperature == null) {
			throw new Exception("BloodPressure Record was not found");
		}
		return ResponseEntity.ok(temperature);
	}

	// GET - BY Patient Name

	@GetMapping("/bloodPressure/{patientName}")
	public ResponseEntity<List<BloodPressure>> getBloodPressurebyPatientName(@PathVariable String patientName)
			throws Exception {
		List<BloodPressure> bloodPressure = service.getLatestBloodPressureRecordByPatientName(patientName);
		if (bloodPressure == null) {
			throw new Exception("BloodPressure Record was not found");
		}
		return ResponseEntity.ok(bloodPressure);
	}

	@GetMapping("/bmi/{patientName}")
	public ResponseEntity<List<BMI>> getBMIbyPatientName(@PathVariable String patientName) throws Exception {
		List<BMI> bmi = service.getLatestBMIRecordByPatientName(patientName);
		if (bmi == null) {
			throw new Exception("BMI Record was not found");
		}
		return ResponseEntity.ok(bmi);
	}

	@GetMapping("/oxygenLevel/{patientName}")
	public ResponseEntity<List<OxygenLevel>> getOxygenLevelbyPatientName(@PathVariable String patientName)
			throws Exception {
		List<OxygenLevel> oxygenLevel = service.getLatestOxygenLevelRecordByPatientName(patientName);
		if (oxygenLevel == null) {
			throw new Exception("OxygenLevel Record was not found");
		}
		return ResponseEntity.ok(oxygenLevel);
	}

	@GetMapping("/sleepTracking/{patientName}")
	public ResponseEntity<List<SleepTracking>> getSleepTrackingbyPatientName(@PathVariable String patientName)
			throws Exception {
		List<SleepTracking> sleepTracking = service.getLatestSleepTrackingRecordByPatientName(patientName);
		if (sleepTracking == null) {
			throw new Exception("SleepTracking Record was not found");
		}
		return ResponseEntity.ok(sleepTracking);
	}

	@GetMapping("/stepCount/{patientName}")
	public ResponseEntity<List<StepCount>> getStepCountbyPatientName(@PathVariable String patientName)
			throws Exception {
		List<StepCount> stepCount = service.getLatestStepCountRecordByPatientName(patientName);
		if (stepCount == null) {
			throw new Exception("StepCount Record was not found");
		}
		return ResponseEntity.ok(stepCount);
	}

	@GetMapping("/temperature/{patientName}")
	public ResponseEntity<List<Temperature>> getTemperaturebyPatientName(@PathVariable String patientName)
			throws Exception {
		List<Temperature> temperature = service.getLatestTemperatureRecordByPatientName(patientName);
		if (temperature == null) {
			throw new Exception("BloodPressure Record was not found");
		}
		return ResponseEntity.ok(temperature);
	}

	// POST - CREATE

	@PostMapping("/bloodPressure")
	public ResponseEntity<BloodPressure> createBloodPressure(@RequestBody BloodPressure bloodPressure)
			throws UnsupportedEncodingException {
		return ResponseEntity.ok(service.createBloodPressureRecord(bloodPressure));
	}

	@PostMapping("/bmi")
	public ResponseEntity<BMI> createBMI(@RequestBody BMI bmi) throws UnsupportedEncodingException {
		return ResponseEntity.ok(service.createBMIRecord(bmi));
	}

	@PostMapping("/oxygenLevel")
	public ResponseEntity<OxygenLevel> createOxygenLevel(@RequestBody OxygenLevel oxygenLevel)
			throws UnsupportedEncodingException {
		return ResponseEntity.ok(service.createOxygenLevelRecord(oxygenLevel));
	}

	@PostMapping("/sleepTracking")
	public ResponseEntity<SleepTracking> createSleepTracking(@RequestBody SleepTracking sleepTracking)
			throws UnsupportedEncodingException {
		return ResponseEntity.ok(service.createSleepTrackingRecord(sleepTracking));
	}

	@PostMapping("/stepCount")
	public ResponseEntity<StepCount> createStepCount(@RequestBody StepCount stepCount)
			throws UnsupportedEncodingException {
		return ResponseEntity.ok(service.createStepCountRecord(stepCount));
	}

	@PostMapping("/temperature")
	public ResponseEntity<Temperature> createTemperature(@RequestBody Temperature temperature)
			throws UnsupportedEncodingException {
		return ResponseEntity.ok(service.createTemperatureRecord(temperature));
	}

	// PUT - Update

	@PutMapping("/bloodPressure/{id}")
	public ResponseEntity<BloodPressure> updateBloodPressure(@RequestBody BloodPressure bloodPressure,
			@PathVariable String id) throws Exception {
		return ResponseEntity.ok(service.updateBloodPressureRecord(bloodPressure, id));
	}

	@PutMapping("/bmi/{id}")
	public ResponseEntity<BMI> updateBMI(@RequestBody BMI bmi, @PathVariable String id) throws Exception {
		return ResponseEntity.ok(service.updateBMIRecord(bmi, id));
	}

	@PutMapping("/oxygenLevel/{id}")
	public ResponseEntity<OxygenLevel> updateOxygenLevel(@RequestBody OxygenLevel oxygenLevel, @PathVariable String id)
			throws Exception {
		return ResponseEntity.ok(service.updateOxygenLevelRecord(oxygenLevel, id));
	}

	@PutMapping("/sleepTracking/{id}")
	public ResponseEntity<SleepTracking> updateSleepTracking(@RequestBody SleepTracking sleepTracking,
			@PathVariable String id) throws Exception {
		return ResponseEntity.ok(service.updateSleepTrackingRecord(sleepTracking, id));
	}

	@PutMapping("/stepCount/{id}")
	public ResponseEntity<StepCount> updateStepCount(@RequestBody StepCount stepCount, @PathVariable String id)
			throws Exception {
		return ResponseEntity.ok(service.updateStepCountRecord(stepCount, id));
	}

	@PutMapping("/temperature/{id}")
	public ResponseEntity<Temperature> updateTemperature(@RequestBody Temperature temperature, @PathVariable String id)
			throws Exception {
		return ResponseEntity.ok(service.updateTemperatureRecord(temperature, id));
	}

	// DELETE - remove

	@DeleteMapping("/bloodPressure/{id}")
	public ResponseEntity<?> deleteBloodPressure(@PathVariable String id) throws Exception {
		service.deleteBloodPressureRecord(id);
		return (ResponseEntity<?>) ResponseEntity.noContent();
	}

	@DeleteMapping("/bmi/{id}")
	public ResponseEntity<?> deleteBMI(@PathVariable String id) throws Exception {
		service.deleteBMIRecord(id);
		return (ResponseEntity<?>) ResponseEntity.noContent();
	}

	@DeleteMapping("/oxygenLevel/{id}")
	public ResponseEntity<?> deleteOxygenLevel(@PathVariable String id) throws Exception {
		service.deleteOxygenLevelRecord(id);
		return (ResponseEntity<?>) ResponseEntity.noContent();
	}

	@DeleteMapping("/sleepTracking/{id}")
	public ResponseEntity<?> deleteSleepTracking(@PathVariable String id) throws Exception {
		service.deleteSleepTrackingRecord(id);
		return (ResponseEntity<?>) ResponseEntity.noContent();
	}

	@DeleteMapping("/stepCount/{id}")
	public ResponseEntity<?> deleteStepCount(@PathVariable String id) throws Exception {
		service.deleteStepCountRecord(id);
		return (ResponseEntity<?>) ResponseEntity.noContent();
	}

	@DeleteMapping("/temperature/{id}")
	public ResponseEntity<?> deleteTemperature(@PathVariable String id) throws Exception {
		service.deleteTemperatureRecord(id);
		return (ResponseEntity<?>) ResponseEntity.noContent();
	}

	@PostMapping("/send/{patientId}")
	public HeadersBuilder<?> sendData(@PathVariable String patientId) {
		service.sendData(patientId);
		return ResponseEntity.noContent();
	}

}
