package com.example.demo1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.entities.HrEntity;

@Repository
public interface HrRepos extends JpaRepository<HrEntity,Integer>{

}
