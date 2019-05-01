package com.zamacloud.multitenancyclient;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Fact S Musingarimi
 * 4/27/19
 * 3:47 AM
 */
public interface OrderRepository extends JpaRepository<Order,Long> {
}
