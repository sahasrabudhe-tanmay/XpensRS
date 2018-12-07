package com.xpens.service;

import java.util.List;

import com.xpens.model.Day;

public interface DayService {
	
	public List<Day> getAllDays();
	
	public Day getDay(String id);
	
	public void postDay(Day day);


}
