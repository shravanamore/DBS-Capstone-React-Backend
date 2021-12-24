package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

import com.dbs.entity.Client;
import com.dbs.entity.Custodian;
import com.dbs.entity.Stock;

public interface CustodianRepository extends JpaRepository<Custodian, String>{

}
=======
import org.springframework.stereotype.Repository;
import com.dbs.entity.Custodian;

@Repository
public interface CustodianRepository extends JpaRepository<Custodian, String>{
	
}

>>>>>>> 2385695fef25d6dc1e9203ac3e22e320a09cace2
