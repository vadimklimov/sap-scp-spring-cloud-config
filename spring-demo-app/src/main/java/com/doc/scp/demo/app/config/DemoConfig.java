package com.doc.scp.demo.app.config;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "demo")
public class DemoConfig {

	private String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@PostConstruct
	private void init() {
		this.comment = Optional	.ofNullable(this.comment)
								.orElse("This is a default message from local application");
	}

}
