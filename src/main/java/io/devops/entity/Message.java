package io.devops.entity;

public class Message {

	public String message;
	public String to;
	public String from;
	public short timeToLifeSec;

	Message() {
	}

	Message(String message, String to, String from, short timeToLifeSec) {
		this.message = message;
		this.to = to;
		this.from = from;
		this.timeToLifeSec = timeToLifeSec;

	}

}
