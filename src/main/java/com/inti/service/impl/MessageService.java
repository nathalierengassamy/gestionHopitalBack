package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Message;
import com.inti.entities.Message;
import com.inti.repository.MessageRepository;
import com.inti.service.interfaces.IMessageService;

@Service
public class MessageService implements IMessageService {
	
	@Autowired
	MessageRepository messageRepository;
	
	@Override
	public List<Message> findAll() {
		
		return messageRepository.findAll();
	}

	@Override
	public Message findOne(Long id) {
		
		return messageRepository.findById(id).get();
	}

	@Override
	public Message save(Message message) {

		return messageRepository.save(message);
	}

	@Override
	public void delete(Long id) {
		messageRepository.deleteById(id);
		
	}

}
