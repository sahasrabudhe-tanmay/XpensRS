package com.xpens.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpens.model.Day;
import com.xpens.repository.DayRepository;

@Service
public class DayServiceImpl implements DayService {

	@Autowired
	DayRepository dayRepository;

	public List<Day> getAllDays() {
		List<Day> days = new ArrayList<Day>();
		dayRepository.findAll().forEach(days::add);
		return days;
	}
	
	public Day getDay(String id) {
		return dayRepository.findById(id).orElse(null);
	}
	
	public void postDay(Day day) {
		day.setTotalExpense("0");
		day.getExpenses().forEach(expense -> {
			day.setTotalExpense(Integer.toString(Integer.parseInt(day.getTotalExpense()) + Integer.parseInt(expense.getCost())));
		});
		dayRepository.save(day);
	}
	
}
