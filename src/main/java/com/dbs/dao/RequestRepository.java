package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.Request;

public interface RequestRepository extends JpaRepository<Request, Long> {

}
