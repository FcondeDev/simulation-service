package com.simulation.service.service.impl;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.simulation.service.dto.NationalArchivesSimulationResponseDTO;
import com.simulation.service.dto.NationalRegistrySimulationResponseDTO;
import com.simulation.service.dto.ProspectDTO;
import com.simulation.service.dto.ProspectQualificationSimulationResponseDTO;
import com.simulation.service.service.SimulationService;

@Service
public class SimulationServiceImpl implements SimulationService {

	Logger logger = LoggerFactory.getLogger(SimulationServiceImpl.class);

	@Override
	public NationalRegistrySimulationResponseDTO nationalRegistryIdentificationSystem(String clientId)
			throws InterruptedException {
		logger.info("clientid to check: {}", clientId);
		int randomInt = new Random().nextInt(101);
		Thread.sleep(1000L);
		logger.info("national registry responding..");
		if (randomInt <= 100 && randomInt >= 80) {
			return new NationalRegistrySimulationResponseDTO(false, "DATA DOES NOT MATCH");
		} else {
			return new NationalRegistrySimulationResponseDTO(true, null);
		}

	}

	@Override
	public NationalArchivesSimulationResponseDTO nationalArchivesSystem(String clientId) throws InterruptedException {
		logger.info("clientid to check: {}", clientId);
		int randomInt = new Random().nextInt(101);
		Thread.sleep(1500L);
		logger.info("national archives responding..");
		if (randomInt <= 100 && randomInt >= 70) {
			return new NationalArchivesSimulationResponseDTO(false, "CLIENT ID HAS 4 JUDICIAL RECORDS");
		} else {
			return new NationalArchivesSimulationResponseDTO(true, null);
		}
	}

	@Override
	public ProspectQualificationSimulationResponseDTO prospectQualificationSystem(ProspectDTO prospectDTO)
			throws InterruptedException {
		logger.info("clientid for qualification: {}", prospectDTO.getClientId());
		int randomInt = new Random().nextInt(101);
		Thread.sleep(500L);
		logger.info("prospect qualification responding..");
		if (randomInt > 60 && prospectDTO.isClientValidatedAgainstNationalRegistry()
				&& prospectDTO.isClientValidatedAgainstNationalArchives()) {
			return new ProspectQualificationSimulationResponseDTO(true);
		} else {
			return new ProspectQualificationSimulationResponseDTO(false);
		}

	}

}
