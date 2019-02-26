package com.tomparka.springaws.workoutsession;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SessionService {

	private List<WorkoutSession> workoutSessions = new ArrayList<>(
			Arrays.asList(new WorkoutSession(LocalDate.now(), 175, 200, 200, 200),
					new WorkoutSession(LocalDate.now().plusDays(1), 175, 205, 210, 215),
					new WorkoutSession(LocalDate.now().plusDays(2), 178, 215, 240, 295)));

	public List<WorkoutSession> getAllSessions() {
		return workoutSessions;
	}

	public WorkoutSession getSession(LocalDate date) {
		for (WorkoutSession session : workoutSessions) {
			if (session.getDate().equals(date)) {
				return session;
			}
		}
		return null;
	}

	public void createSession(WorkoutSession session) {
		workoutSessions.add(session);
	}

	public void updateSession(LocalDate date, WorkoutSession newSession) {
		for (WorkoutSession session : workoutSessions) {
			if (session.getDate().equals(date)) {
				workoutSessions.remove(session);
				workoutSessions.add(newSession);
				return;
			}
		}
	}

	public void deleteSession(LocalDate date) {
		for (WorkoutSession session : workoutSessions) {
			if (session.getDate().equals(date)) {
				workoutSessions.remove(session);
				return;
			}
		}
	}
}
