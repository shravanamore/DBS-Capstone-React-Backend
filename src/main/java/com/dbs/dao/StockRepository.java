package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.Client;
import com.dbs.entity.Custodian;

public interface StockRepository extends JpaRepository<Custodian, Long>{

}
