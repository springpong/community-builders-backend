package com.volunteer.events;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Events{


    private String eventName;
    private String eventLocation;
    private LocalDate eventDate;
    private LocalTime eventTime;
    private String eventDescription;
    private String charityName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    public Events() {}
    
    public Events(Events events) {
    	this.id = events.id;
    	this.charityName = events.charityName;
    	this.eventName = events.eventName;
    	this.eventLocation = events.eventLocation;
    	this.eventDate = events.eventDate;
    	this.eventTime = events.eventTime;
    	this.eventDescription = events.eventDescription;
    }
    
    public Events (Long id, String charityName, String eventName, String eventLocation, LocalDate eventDate, LocalTime eventTime, String eventDescription) {
    	this.id = id;
    	this.charityName = charityName;
    	this.eventName = eventName;
    	this.eventLocation = eventLocation;
    	this.eventDate = eventDate;
    	this.eventTime = eventTime;
    	this.eventDescription = eventDescription;
    }
    


	public Long getId() {
		return id;
	}


	public void setid(Long id) {
		this.id = id;
	}


	public String getCharityName() {
		return charityName;
	}


	public void setCharityName(String charityName) {
		this.charityName = charityName;
	}


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public String getEventLocation() {
		return eventLocation;
	}


	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}


	public LocalDate getEventDate() {
		return eventDate;
	}


	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}


	public LocalTime getEventTime() {
		return eventTime;
	}


	public void setEventTime(LocalTime eventTime) {
		this.eventTime = eventTime;
	}


	public String getEventDescription() {
		return eventDescription;
	}


	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
    
}
