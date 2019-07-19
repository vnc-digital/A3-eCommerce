package com.vnc.nextuple.repository;

import org.springframework.data.repository.CrudRepository;

import com.vnc.nextuple.modal.User;

public interface UserRepository extends  CrudRepository<User, String>{

}
