package com.law.orm.service.dbrestapi.repository;

import com.law.orm.service.dbrestapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
