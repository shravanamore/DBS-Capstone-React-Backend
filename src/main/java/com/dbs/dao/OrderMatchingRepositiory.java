package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dbs.entity.OrderMatching;

@Repository
public interface OrderMatchingRepositiory extends JpaRepository<OrderMatching, Long>{

}
