package com.simulation.service.dto;

public class NationalArchivesSimulationResponseDTO {

	private boolean success;
	private String failureReason;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public NationalArchivesSimulationResponseDTO(boolean success, String failureReason) {
		this.success = success;
		this.failureReason = failureReason;
	}

}
