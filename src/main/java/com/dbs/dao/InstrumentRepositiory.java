package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dbs.entity.Instrument;

@Repository
public interface InstrumentRepositiory extends JpaRepository<Instrument, String>{

}
