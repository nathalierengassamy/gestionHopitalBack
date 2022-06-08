package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Message;

public interface IMessageService {
	List<Message> findAll();
	
	Message findOne (Long id);
	
	Message save(Message rdv);
	
	void delete(Long id);
}
