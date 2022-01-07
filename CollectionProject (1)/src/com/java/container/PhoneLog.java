package com.java.container;

import java.time.LocalDateTime;

public class PhoneLog {
	
	private String who; //julie
	private String what; // missed
	private LocalDateTime when; //10-Oct-2021 12:30:00
	
	public PhoneLog(String who, String what, LocalDateTime when) {
		super();
		this.who = who;
		this.what = what;
		this.when = when;
	}
	
	@Override
	public String toString() {
		return "PhoneLog [who=" + who + ", what=" + what + ", when=" + when + "]";
	}

	
	
}
