package com.vnc.nextuple.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vnc.nextuple.modal.Orders;

@Repository
public interface OrdersRepository extends CrudRepository<Orders,String>{

}
