package com.doc.scp.demo.app.service;

import java.util.UUID;

public class Message {

	private UUID id;
	private String name;
	private String comment;

	public Message(UUID id, String name, String comment) {
		this.id = id;
		this.name = name;
		this.comment = comment;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
