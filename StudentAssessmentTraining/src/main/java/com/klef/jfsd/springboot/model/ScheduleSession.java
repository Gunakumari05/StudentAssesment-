package com.klef.jfsd.springboot.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="schedule_table")
@Entity
public class ScheduleSession 
{
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false,length = 100)
	private Timestamp date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTrainerusername() {
		return trainerusername;
	}
	public void setTrainerusername(String trainerusername) {
		this.trainerusername = trainerusername;
	}
	@Column(nullable = false,length = 100)
	private String venue;
	@Column(nullable = false,length = 100)
	private String description;
	@Column(nullable = false,length = 100)
	private String trainerusername;
	
}
