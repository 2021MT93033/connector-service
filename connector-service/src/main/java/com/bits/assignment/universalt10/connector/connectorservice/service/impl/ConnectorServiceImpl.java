/**
 * 
 */
package com.bits.assignment.universalt10.connector.connectorservice.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bits.assignment.universalt10.connector.connectorservice.model.BMI;
import com.bits.assignment.universalt10.connector.connectorservice.model.BloodPressure;
import com.bits.assignment.universalt10.connector.connectorservice.model.OxygenLevel;
import com.bits.assignment.universalt10.connector.connectorservice.model.PatientData;
import com.bits.assignment.universalt10.connector.connectorservice.model.SimpleMessage;
import com.bits.assignment.universalt10.connector.connectorservice.model.SleepTracking;
import com.bits.assignment.universalt10.connector.connectorservice.model.StepCount;
import com.bits.assignment.universalt10.connector.connectorservice.model.Temperature;
import com.bits.assignment.universalt10.connector.connectorservice.repository.BMIRepository;
import com.bits.assignment.universalt10.connector.connectorservice.repository.BloodPressureRepository;
import com.bits.assignment.universalt10.connector.connectorservice.repository.OxygenLevelRepository;
import com.bits.assignment.universalt10.connector.connectorservice.repository.SleepTrackingRepository;
import com.bits.assignment.universalt10.connector.connectorservice.repository.StepCountRepository;
import com.bits.assignment.universalt10.connector.connectorservice.repository.TemperatureRepository;
import com.bits.assignment.universalt10.connector.connectorservice.service.ConnectorService;

/**
 * @author Vicky
 *
 */
@Service
public class ConnectorServiceImpl implements ConnectorService {

	@Autowired
	private BloodPressureRepository bloodPressureRepository;

	@Autowired
	private BMIRepository bmiRepository;

	@Autowired
	private OxygenLevelRepository oxygenLevelRepository;

	@Autowired
	private SleepTrackingRepository sleepTrackingRepository;

	@Autowired
	private StepCountRepository stepCountRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private TemperatureRepository temperatureRepository;

	@Value("${gateway.url}")
	private String gatewayURL;

	@Override
	public BloodPressure createBloodPressureRecord(BloodPressure bloodPressure) {
		// TODO Auto-generated method stub
		return bloodPressureRepository.save(bloodPressure);
	}

	@Override
	public BloodPressure getBloodPressureRecordById(String id) {
		// TODO Auto-generated method stub
		Optional<BloodPressure> opt = bloodPressureRepository.findById(id);
		return opt.orElse(null);
	}

	@Override
	public List<BloodPressure> getLatestBloodPressureRecordByPatientId(String patientId) {
		// TODO Auto-generated
		return bloodPressureRepository.findByPatientId(patientId);
	}

	@Override
	public List<BloodPressure> getLatestBloodPressureRecordByPatientName(String patientName) {
		// TODO Auto-generated method stub
		return bloodPressureRepository.findByPatientName(patientName);
	}

	@Override
	public List<BloodPressure> getAllBloodPressureRecords() {
		// TODO Auto-generated method stub
		return bloodPressureRepository.findAll();
	}

	@Override
	public BMI createBMIRecord(BMI bmi) {
		// TODO Auto-generated method stub
		return bmiRepository.save(bmi);
	}

	@Override
	public BMI getBMIRecordById(String id) {
		Optional<BMI> opt = bmiRepository.findById(id);
		return opt.orElse(null);
	}

	@Override
	public List<BMI> getLatestBMIRecordByPatientId(String patientId) {
		// TODO Auto-generated method stub
		return bmiRepository.findByPatientId(patientId);
	}

	@Override
	public List<BMI> getLatestBMIRecordByPatientName(String patientName) {
		// TODO Auto-generated method stub
		return bmiRepository.findByPatientName(patientName);
	}

	@Override
	public List<BMI> getAllBMIRecords() {
		// TODO Auto-generated method stub
		return bmiRepository.findAll();
	}

	@Override
	public OxygenLevel createOxygenLevelRecord(OxygenLevel oxyLevel) {
		// TODO Auto-generated method stub
		return oxygenLevelRepository.save(oxyLevel);
	}

	@Override
	public OxygenLevel getOxygenLevelRecordById(String id) {
		Optional<OxygenLevel> opt = oxygenLevelRepository.findById(id);
		return opt.orElse(null);
	}

	@Override
	public List<OxygenLevel> getLatestOxygenLevelRecordByPatientId(String patientId) {
		// TODO Auto-generated method stub
		return oxygenLevelRepository.findByPatientId(patientId);
	}

	@Override
	public List<OxygenLevel> getLatestOxygenLevelRecordByPatientName(String patientName) {
		// TODO Auto-generated method stub
		return oxygenLevelRepository.findByPatientName(patientName);
	}

	@Override
	public List<OxygenLevel> getAllOxygenLevelRecords() {
		// TODO Auto-generated method stub
		return oxygenLevelRepository.findAll();
	}

	@Override
	public SleepTracking createSleepTrackingRecord(SleepTracking sleepTracking) {
		// TODO Auto-generated method stub
		return sleepTrackingRepository.save(sleepTracking);
	}

	@Override
	public SleepTracking getSleepTrackingRecordById(String id) {
		Optional<SleepTracking> opt = sleepTrackingRepository.findById(id);
		return opt.orElse(null);
	}

	@Override
	public List<SleepTracking> getLatestSleepTrackingRecordByPatientId(String patientId) {
		// TODO Auto-generated method stub
		return sleepTrackingRepository.findByPatientId(patientId);
	}

	@Override
	public List<SleepTracking> getLatestSleepTrackingRecordByPatientName(String patientName) {
		// TODO Auto-generated method stub
		return sleepTrackingRepository.findByPatientName(patientName);
	}

	@Override
	public List<SleepTracking> getAllSleepTrackingRecords() {
		// TODO Auto-generated method stub
		return sleepTrackingRepository.findAll();
	}

	@Override
	public StepCount createStepCountRecord(StepCount stepCount) {
		// TODO Auto-generated method stub
		return stepCountRepository.save(stepCount);
	}

	@Override
	public StepCount getStepCountRecordById(String id) {
		Optional<StepCount> opt = stepCountRepository.findById(id);
		return opt.orElse(null);
	}

	@Override
	public List<StepCount> getLatestStepCountRecordByPatientId(String patientId) {
		// TODO Auto-generated method stub
		return stepCountRepository.findByPatientId(patientId);
	}

	@Override
	public List<StepCount> getLatestStepCountRecordByPatientName(String patientName) {
		// TODO Auto-generated method stub
		return stepCountRepository.findByPatientName(patientName);
	}

	@Override
	public List<StepCount> getAllStepCountRecords() {
		// TODO Auto-generated method stub
		return stepCountRepository.findAll();
	}

	@Override
	public Temperature createTemperatureRecord(Temperature temperature) {
		// TODO Auto-generated method stub
		return temperatureRepository.save(temperature);
	}

	@Override
	public Temperature getTemperatureRecordById(String id) {
		Optional<Temperature> opt = temperatureRepository.findById(id);
		return opt.orElse(null);
	}

	@Override
	public List<Temperature> getLatestTemperatureRecordByPatientId(String patientId) {
		// TODO Auto-generated method stub
		return temperatureRepository.findByPatientId(patientId);
	}

	@Override
	public List<Temperature> getLatestTemperatureRecordByPatientName(String patientName) {
		// TODO Auto-generated method stub
		return temperatureRepository.findByPatientName(patientName);
	}

	@Override
	public List<Temperature> getAllTemperatureRecords() {
		// TODO Auto-generated method stub
		return temperatureRepository.findAll();
	}

	@Override
	public BloodPressure updateBloodPressureRecord(BloodPressure bloodPressure, String id) throws Exception {
		if (!id.equals(bloodPressure.getId())) {
			throw new Exception("Invalid Request the id is not matching with the request body");
		}

		BloodPressure bp = getBloodPressureRecordById(id);

		if (bp == null) {
			throw new Exception("Record doesnot exist for the given id");
		}

		return bloodPressureRepository.save(bloodPressure);
	}

	@Override
	public OxygenLevel updateOxygenLevelRecord(OxygenLevel oxygenLevel, String id) throws Exception {

		if (!id.equals(oxygenLevel.getId())) {
			throw new Exception("Invalid Request the id is not matching with the request body");
		}

		OxygenLevel oxy = getOxygenLevelRecordById(id);

		if (oxy == null) {
			throw new Exception("Record doesnot exist for the given id");
		}

		return oxygenLevelRepository.save(oxygenLevel);
	}

	@Override
	public BMI updateBMIRecord(BMI bmi, String id) throws Exception {
		if (!id.equals(bmi.getId())) {
			throw new Exception("Invalid Request the id is not matching with the request body");
		}

		BMI bp = getBMIRecordById(id);

		if (bp == null) {
			throw new Exception("Record doesnot exist for the given id");
		}

		return bmiRepository.save(bmi);
	}

	@Override
	public SleepTracking updateSleepTrackingRecord(SleepTracking sleepTracking, String id) throws Exception {
		if (!id.equals(sleepTracking.getId())) {
			throw new Exception("Invalid Request the id is not matching with the request body");
		}

		SleepTracking bp = getSleepTrackingRecordById(id);

		if (bp == null) {
			throw new Exception("Record doesnot exist for the given id");
		}

		return sleepTrackingRepository.save(sleepTracking);
	}

	@Override
	public StepCount updateStepCountRecord(StepCount stepCount, String id) throws Exception {
		if (!id.equals(stepCount.getId())) {
			throw new Exception("Invalid Request the id is not matching with the request body");
		}

		StepCount bp = getStepCountRecordById(id);

		if (bp == null) {
			throw new Exception("Record doesnot exist for the given id");
		}

		return stepCountRepository.save(stepCount);
	}

	@Override
	public Temperature updateTemperatureRecord(Temperature temperature, String id) throws Exception {
		if (!id.equals(temperature.getId())) {
			throw new Exception("Invalid Request the id is not matching with the request body");
		}

		Temperature bp = getTemperatureRecordById(id);

		if (bp == null) {
			throw new Exception("Record doesnot exist for the given id");
		}

		return temperatureRepository.save(temperature);
	}

	@Override
	public void deleteBloodPressureRecord(String id) throws Exception {

		BloodPressure existing = getBloodPressureRecordById(id);
		if (existing == null) {
			throw new Exception("Record does not exist to be deleted");
		}

		bloodPressureRepository.delete(existing);

	}

	@Override
	public void deleteOxygenLevelRecord(String id) throws Exception {

		OxygenLevel existing = getOxygenLevelRecordById(id);
		if (existing == null) {
			throw new Exception("Record does not exist to be deleted");
		}

		oxygenLevelRepository.delete(existing);

	}

	@Override
	public void deleteBMIRecord(String id) throws Exception {

		BMI existing = getBMIRecordById(id);
		if (existing == null) {
			throw new Exception("Record does not exist to be deleted");
		}

		bmiRepository.delete(existing);

	}

	@Override
	public void deleteStepCountRecord(String id) throws Exception {

		StepCount existing = getStepCountRecordById(id);
		if (existing == null) {
			throw new Exception("Record does not exist to be deleted");
		}

		stepCountRepository.delete(existing);

	}

	@Override
	public void deleteSleepTrackingRecord(String id) throws Exception {

		SleepTracking existing = getSleepTrackingRecordById(id);
		if (existing == null) {
			throw new Exception("Record does not exist to be deleted");
		}

		sleepTrackingRepository.delete(existing);

	}

	@Override
	public void deleteTemperatureRecord(String id) throws Exception {

		Temperature existing = getTemperatureRecordById(id);
		if (existing == null) {
			throw new Exception("Record does not exist to be deleted");
		}

		temperatureRepository.delete(existing);

	}

	@Override
	public void sendData(String patientId) {
		String url = "http://localhost:9007/edge-patient-monitoring-service/monitor";
		PatientData data = new PatientData();
		data.setPatientId(patientId);
		List<BloodPressure> list = bloodPressureRepository.findByPatientId(patientId);
		if (list != null && !list.isEmpty()) {
			data.setBloodPressure(list.get(0).getValue());
		}
		List<OxygenLevel> oxylist = oxygenLevelRepository.findByPatientId(patientId);
		if (oxylist != null && !oxylist.isEmpty()) {
			data.setOxygenLevel(oxylist.get(0).getValue());
		}
		List<BMI> bmilist = bmiRepository.findByPatientId(patientId);
		if (bmilist != null && !bmilist.isEmpty()) {
			data.setBmi(bmilist.get(0).getValue());
		}
		List<StepCount> steplist = stepCountRepository.findByPatientId(patientId);
		if (steplist != null && !steplist.isEmpty()) {
			data.setStepCount(steplist.get(0).getValue());
		}
		List<SleepTracking> sleeplist = sleepTrackingRepository.findByPatientId(patientId);
		if (sleeplist != null && !sleeplist.isEmpty()) {
			data.setSleepTracking(sleeplist.get(0).getDeepSleepHours() + "");
		}
		List<Temperature> templist = temperatureRepository.findByPatientId(patientId);
		if (templist != null && !templist.isEmpty()) {
			data.setTemperature(templist.get(0).getValue());
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<PatientData> request = new HttpEntity<>(data, headers);
		ResponseEntity<SimpleMessage> entity = restTemplate.postForEntity(url, request, SimpleMessage.class);

	}

}
