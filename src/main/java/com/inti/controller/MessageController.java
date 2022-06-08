package com.inti.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Message;
import com.inti.service.interfaces.IMessageService;

@RestController // RestFul WS
@CrossOrigin
public class MessageController {
	@Autowired
	IMessageService messageService;

	@GetMapping("/messages")
	public List<Message> findAll() {
		return messageService.findAll();
	}
	
	@GetMapping("/messages/{idMessage}")
	public Message findOne(@PathVariable("idMessage") Long id) {
		return messageService.findOne(id);
	}
	
	@PostMapping("/messages")
	public Message saveMessage(@RequestBody Message message) {
		return messageService.save(message);
	}

	@DeleteMapping("/messages/{idMessage}")
	public void deleteMessage(@PathVariable("idMessage") Long id) {
		messageService.delete(id);
	}
	
	@PutMapping("/messages/{idMessage}")
	public Message updateMessageWithPut(@PathVariable("idMessage") Long id, @RequestBody Message message) { //
		Message currentMessage = messageService.findOne(id);
		currentMessage.setLibelle(message.getLibelle());
		return messageService.save(currentMessage);
	}

	@PatchMapping("/messages/{idMessage}")
	public Message updateMessageWithPatch(@PathVariable("idMessage") Long id, @RequestBody Message message) {
		Message currentMessage = messageService.findOne(id);
		currentMessage.setLibelle(message.getLibelle());
		return messageService.save(currentMessage);
	}
}
