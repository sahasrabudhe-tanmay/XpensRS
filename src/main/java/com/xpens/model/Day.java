package com.xpens.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Day {
	
	@Id
	private String date;
	private String dayName;
	private String totalExpense;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Expense> expenses;
	
	public Day() {}
	
	public Day(String date, String dayName, List<Expense> expenses, String totalExpense) {
		this.date = date;
		this.dayName = dayName;
		this.expenses = expenses;
		this.totalExpense = totalExpense;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public List<Expense> getExpenses() {
		return expenses;
	}
	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}
	public String getTotalExpense() {
		return totalExpense;
	}
	public void setTotalExpense(String totalExpense) {
		this.totalExpense = totalExpense;
	}
	
	

}
