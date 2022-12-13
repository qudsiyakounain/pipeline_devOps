package com.example.demo1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo1.entities.HrEntity;
import com.example.demo1.services.HrService;

@RestController

public class HrController{
	
	@Autowired
	
	private HrService service;
	
	@GetMapping(value="/findalll",produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<HrEntity> getAllhrs(){
		
		List<HrEntity> hrlist= service.getAllHr();
		return hrlist;
		
		
	}
	
	@GetMapping(value="/getbyid/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
	 public Optional<HrEntity> hrById(@PathVariable("id") int id){
		Optional<HrEntity> hbi=service.getHrById(id);
		return hbi;
		
	}
	
	@PostMapping(value="/addhr",consumes= MediaType.APPLICATION_JSON_VALUE)
	public  void addhr(@RequestBody HrEntity h1) {
		service.addhr(h1);
	}
	
	@DeleteMapping(value="/delbyid/{id}")
	public void delById(@PathVariable("id") int id) {
		service.delById(id);
}
	@PutMapping(value="/update/id/{id}",consumes =  MediaType.APPLICATION_JSON_VALUE)
	public void updateById(@PathVariable("id") int id,@RequestBody HrEntity up) {
		HrEntity et1=null;
		Optional<HrEntity> emp=service.getHrById(id);   //checking record exists or not db 
		
		et1.setHr_name(up.getHr_name()); 
		et1.setHr_age(up.getHr_age());
		et1.setHr_address(up.getHr_address());
		service.updateByHr(et1);

		
		
	}
	
	
}