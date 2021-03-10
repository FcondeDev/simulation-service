package com.simulation.service.dto;

public class ProspectDTO {

	private String clientId;
	private boolean clientValidatedAgainstNationalRegistry;
	private boolean clientValidatedAgainstNationalArchives;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public boolean isClientValidatedAgainstNationalRegistry() {
		return clientValidatedAgainstNationalRegistry;
	}

	public void setClientValidatedAgainstNationalRegistry(boolean clientValidatedAgainstNationalRegistry) {
		this.clientValidatedAgainstNationalRegistry = clientValidatedAgainstNationalRegistry;
	}

	public boolean isClientValidatedAgainstNationalArchives() {
		return clientValidatedAgainstNationalArchives;
	}

	public void setClientValidatedAgainstNationalArchives(boolean clientValidatedAgainstNationalArchives) {
		this.clientValidatedAgainstNationalArchives = clientValidatedAgainstNationalArchives;
	}

}
