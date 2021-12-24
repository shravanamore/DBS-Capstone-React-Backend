package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dbs.entity.Sell;

@Repository
public interface SellRepository extends JpaRepository<Sell, Long> {

}
