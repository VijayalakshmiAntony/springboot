package com.schoolmanagement.software.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.schoolmanagement.software.dto.Studentdetails;
import com.schoolmanagement.software.repo.Repo;

import net.minidev.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentCRUDOperations {

    @Autowired
    Repo repo;

    @PostMapping("/createNewStudentRecord")
    void createNewStudent(@RequestBody Studentdetails studentDetails){

        repo.save(studentDetails);

    }
    
    @PostMapping("/createNewStudentRecord2")
    void createNewStudent2(@RequestBody String inputJson){
		/*
		 * JSONObject jsonObj = new JSONObject(); jsonObj.getAsString(inputJson);
		 * System.out.println(jsonObj); ObjectMapper objectMapper = new ObjectMapper();
		 * System.out.println( jsonObj.getAsString(inputJson).toString()); //
		 * Deserialize the JSON string into an array of User objects Studentdetails
		 * studentDetails = null; try { studentDetails =
		 * objectMapper.readValue(jsonObj.getAsString(inputJson), Studentdetails.class);
		 * } catch (JsonMappingException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (JsonProcessingException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */ 
    	ObjectMapper objectMapper = new ObjectMapper();
    	Studentdetails studentDetails = null;
		try {
			studentDetails = objectMapper.readValue(inputJson, Studentdetails.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
        repo.save(studentDetails);

    }


    @GetMapping("/getAllStudentDetails")
    List<Studentdetails> getAllStudents(){

        return repo.findAll();

    }

    @GetMapping("/getStudentDetails{id}")
    Optional<Studentdetails> getStudent(@PathVariable("id") Integer id){

        return repo.findById(id);

    }

    @DeleteMapping("/deleteStudentByID/{id}")
    ResponseEntity<String> deleteStudent(@PathVariable("id") Integer id){
        repo.deleteById(id);
        return ResponseEntity.ok("Student " +id+ " deleted successfully");
    }

    @PutMapping("updateStudentDetails")
    void updateStudentDetails(Studentdetails studentDetails){

        repo.save(studentDetails);

    }




}
