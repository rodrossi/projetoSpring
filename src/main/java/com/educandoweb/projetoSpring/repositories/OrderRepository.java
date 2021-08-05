package com.educandoweb.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projetoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
