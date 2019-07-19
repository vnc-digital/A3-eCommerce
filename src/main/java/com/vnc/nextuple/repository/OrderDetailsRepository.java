package com.vnc.nextuple.repository;

import org.springframework.stereotype.Repository;

import com.vnc.nextuple.modal.OrderDetails;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface OrderDetailsRepository  extends CrudRepository<OrderDetails,String>{

}
