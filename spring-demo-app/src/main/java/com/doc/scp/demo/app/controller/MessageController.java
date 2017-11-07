package com.doc.scp.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.doc.scp.demo.app.service.Message;
import com.doc.scp.demo.app.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageSrv;

	@RequestMapping(value = "/messages/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> getMessageByName(@PathVariable(value = "name") String name) {

		return ResponseEntity	.ok()
								.body(messageSrv.createMessage(name));

	}

}
