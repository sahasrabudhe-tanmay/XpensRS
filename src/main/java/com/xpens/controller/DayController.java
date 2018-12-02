package com.xpens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xpens.model.Day;
import com.xpens.service.DayService;

@RestController
@RequestMapping("/xpens")
public class DayController {
	
	@Autowired
	DayService dayService;
	
	@GetMapping("/days")
	public List<Day> getAllDays(){
		return dayService.getAllDays();
	}
	
	@GetMapping("/day/{id}")
	public Day getDay(@PathVariable String id) {
		return dayService.getDay(id);
	}
	
	@PostMapping("/day")
	public void postDay(@RequestBody Day day) {
		dayService.postDay(day);
	}

}
