package io.devops.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.devops.entity.Message;

@RestController
public class MessageController {

	@PostMapping("/DevOps")
	public String firstPage(@RequestBody Message newMessage) {
		return "message: " + newMessage.message + " to: " + newMessage.to + " from: " + newMessage.from;
	}

	@RequestMapping({ "/DevOpsSaludo" })
	public String firstPage(String message) {
		return "Hello!" + message;
	}

}
