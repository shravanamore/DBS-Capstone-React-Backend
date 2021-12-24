package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.entity.Client;

public interface ClientRepository extends JpaRepository<Client, String>{

}
