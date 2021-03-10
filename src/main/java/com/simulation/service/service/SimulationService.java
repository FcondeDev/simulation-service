package com.simulation.service.service;

import com.simulation.service.dto.NationalArchivesSimulationResponseDTO;
import com.simulation.service.dto.NationalRegistrySimulationResponseDTO;
import com.simulation.service.dto.ProspectDTO;
import com.simulation.service.dto.ProspectQualificationSimulationResponseDTO;

public interface SimulationService {

	public NationalRegistrySimulationResponseDTO nationalRegistryIdentificationSystem(String clientId)
			throws InterruptedException;

	public NationalArchivesSimulationResponseDTO nationalArchivesSystem(String clientId) throws InterruptedException;

	public ProspectQualificationSimulationResponseDTO prospectQualificationSystem(ProspectDTO prospectDTO)
			throws InterruptedException;

}
