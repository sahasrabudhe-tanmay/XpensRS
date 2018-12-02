package com.xpens.repository;

import org.springframework.data.repository.CrudRepository;

import com.xpens.model.Day;

public interface DayRepository extends CrudRepository<Day, String> {

}
