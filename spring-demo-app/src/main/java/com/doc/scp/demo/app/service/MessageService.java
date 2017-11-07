package com.doc.scp.demo.app.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class MessageService {

	@Value("${demo.comment:#{null}}")
	private String comment;

	public Message createMessage(String id) {

		return new Message(UUID.randomUUID(), id, comment);

	}

}
