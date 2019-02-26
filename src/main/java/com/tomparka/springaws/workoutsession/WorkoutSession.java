package com.tomparka.springaws.workoutsession;

import java.time.LocalDate;

public class WorkoutSession {

	private LocalDate date;
	private float weight;
	private int bench;
	private int squat;
	private int deadlift;
	
	public WorkoutSession(LocalDate date, float weight, int bench, int squat, int deadlift) {
		super();
		this.date = date;
		this.weight = weight;
		this.bench = bench;
		this.squat = squat;
		this.deadlift = deadlift;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getBench() {
		return bench;
	}
	public void setBench(int bench) {
		this.bench = bench;
	}
	public int getSquat() {
		return squat;
	}
	public void setSquat(int squat) {
		this.squat = squat;
	}
	public int getDeadlift() {
		return deadlift;
	}
	public void setDeadlift(int deadlift) {
		this.deadlift = deadlift;
	}
	
	
	
}
