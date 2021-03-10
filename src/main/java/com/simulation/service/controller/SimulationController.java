package com.simulation.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simulation.service.dto.JsonDTO;
import com.simulation.service.dto.NationalArchivesSimulationResponseDTO;
import com.simulation.service.dto.NationalRegistrySimulationResponseDTO;
import com.simulation.service.dto.ProspectDTO;
import com.simulation.service.dto.ProspectQualificationSimulationResponseDTO;
import com.simulation.service.service.SimulationService;

@RestController
public class SimulationController {

	@Autowired
	private SimulationService simulationService;

	@GetMapping("national/registers/{clientId}")
	public ResponseEntity<JsonDTO<NationalRegistrySimulationResponseDTO>> getNationalRegistryInformation(
			@PathVariable("clientId") String clientId) throws InterruptedException {
		return new ResponseEntity<>(new JsonDTO<>(simulationService.nationalRegistryIdentificationSystem(clientId)),
				HttpStatus.OK);

	}

	@GetMapping("national/archives/{clientId}")
	public ResponseEntity<JsonDTO<NationalArchivesSimulationResponseDTO>> getNationalArchivesInformation(
			@PathVariable("clientId") String clientId) throws InterruptedException {
		return new ResponseEntity<>(new JsonDTO<>(simulationService.nationalArchivesSystem(clientId)), HttpStatus.OK);

	}

	@PostMapping("prospectives")
	public ResponseEntity<JsonDTO<ProspectQualificationSimulationResponseDTO>> getProspectiveQualificationInformation(
			@RequestBody ProspectDTO prospectDTO) throws InterruptedException {
		return new ResponseEntity<>(new JsonDTO<>(simulationService.prospectQualificationSystem(prospectDTO)),
				HttpStatus.OK);

	}
}
