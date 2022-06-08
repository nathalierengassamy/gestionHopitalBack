package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Message;

@Repository
public interface IMessageRepository extends JpaRepository<Message, Long>{

}
