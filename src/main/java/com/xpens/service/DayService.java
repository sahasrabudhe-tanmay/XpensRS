package com.xpens.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xpens.model.Day;

@Service
public interface DayService {

	public List<Day> getAllDays();
	
	public Day getDay(String id);
	
	public void postDay(Day day);

}
