package com.example.TestShop2.repos;

import com.example.TestShop2.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
