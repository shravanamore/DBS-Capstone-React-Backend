package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository< Client, String>{

}
