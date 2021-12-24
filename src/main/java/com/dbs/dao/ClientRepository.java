package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

import com.dbs.entity.Client;

public interface ClientRepository extends JpaRepository<Client, String>{
=======
import org.springframework.stereotype.Repository;

import com.dbs.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository< Client, String>{
>>>>>>> 2385695fef25d6dc1e9203ac3e22e320a09cace2

}
