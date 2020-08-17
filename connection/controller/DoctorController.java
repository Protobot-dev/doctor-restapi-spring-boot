package com.dockersql.connection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dockersql.connection.model.Doctor;
import com.dockersql.connection.service.DoctorService;

@RestController
public class DoctorController {

	private DoctorService doctorService;
	
	@PostMapping("/create")
	public int createDoctor(@RequestBody Doctor doctor) {
		doctorService.saveDoctor(doctor);
		return doctor.getId();
	}
	
	@GetMapping("/view")
	public Iterable<Doctor> viewAllDoctor(){
		return doctorService.getAllDoctor();
	}
	
	
}
