package com.xpens.response;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class ResponseBuilder {
	
	public <T> ResponseEntity<T> buildResponse(T t) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		return ResponseEntity.ok().headers(headers).body(t);
	}
	
}
