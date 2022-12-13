package com.example.demo1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.entities.HrEntity;
import com.example.demo1.repos.HrRepos;


@Service
public class HrService {
	
	@Autowired
	private HrRepos repo;
	//@getmapping
 public	List<HrEntity> getAllHr(){
	
	List<HrEntity> hrlist=repo.findAll();
	
	return hrlist;
	}
 
 //@getMapping -id
 public Optional<HrEntity> getHrById(int id){
	 Optional<HrEntity> hrById=repo.findById(id);
	 return hrById;
 }
 
 //post mapping
 public void addhr(HrEntity hr1) {
	 repo.save(hr1);
	 
 }
 //delete
  public void delById(int id) {
	  repo.deleteById(id);
  }
  //update
  public void updateByHr(HrEntity h1) {
	  repo.save(h1);
  }

}
