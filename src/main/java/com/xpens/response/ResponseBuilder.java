package com.xpens.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.xpens.model.ResponseStatus;

public class ResponseBuilder {
	
	public <T> ResponseEntity<T> buildResponse(T t) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		return ResponseEntity.ok().headers(headers).body(t);
	}
	
	public <T> ResponseEntity<ResponseStatus> buildPostResponse(){
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		List<String> messages = new ArrayList<>();
		messages.add("Day successfully saved");
		
		ResponseStatus status = new ResponseStatus(HttpStatus.OK.toString(), messages);
		
		return ResponseEntity.ok().headers(headers).body(status);
	}
	
}
