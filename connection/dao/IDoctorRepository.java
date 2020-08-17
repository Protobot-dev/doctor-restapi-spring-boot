package com.dockersql.connection.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dockersql.connection.model.Doctor;

@Repository
public interface IDoctorRepository extends CrudRepository<Doctor, Integer>{

}
