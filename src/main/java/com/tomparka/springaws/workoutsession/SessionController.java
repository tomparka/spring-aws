package com.tomparka.springaws.workoutsession;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {
	
	@Autowired
	private SessionService sessionService;
	
	@RequestMapping("/sessions")
	public List<WorkoutSession> getSessions() {
		return sessionService.getAllSessions();
	}
	
	@RequestMapping("/sessions/{date}")
	public WorkoutSession getSession(@PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate date) {
		return sessionService.getSession(date);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/sessions")
	public void createSession(@RequestBody WorkoutSession session) {
		sessionService.createSession(session);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/sessions/{date}")
	public void updateSession(@RequestBody WorkoutSession session, @PathVariable LocalDate date) {
		sessionService.updateSession(date, session);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/sessions/{date}")
	public void deleteSession(@PathVariable LocalDate date) {
		sessionService.deleteSession(date);
	}
	
}
