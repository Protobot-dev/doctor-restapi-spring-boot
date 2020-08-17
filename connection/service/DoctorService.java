package com.dockersql.connection.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dockersql.connection.dao.IDoctorRepository;
import com.dockersql.connection.model.Doctor;

@Service
public class DoctorService {

	@Autowired
	private IDoctorRepository doctorRepository;
	
	public void saveDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
	}
	
	public Iterable<Doctor> getAllDoctor(){
		return doctorRepository.findAll();
	}
	
	public Optional<Doctor> getDoctor(int id){
		return doctorRepository.findById(id);
	}
	
	
}
