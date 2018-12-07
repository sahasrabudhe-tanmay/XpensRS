package com.xpens.model;

import java.util.List;

public class ResponseStatus {
	
	private String status;
	private List<String> messages;
	
	public ResponseStatus(String status, List<String> messages) {
		super();
		this.status = status;
		this.messages = messages;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

}
