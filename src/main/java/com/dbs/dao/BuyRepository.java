package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dbs.entity.Buy;

@Repository
public interface BuyRepository extends JpaRepository<Buy, Long> {

}
