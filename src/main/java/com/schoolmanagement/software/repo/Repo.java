package com.schoolmanagement.software.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schoolmanagement.software.dto.Studentdetails;

@Repository
public interface Repo extends JpaRepository<Studentdetails,Integer> {
}
