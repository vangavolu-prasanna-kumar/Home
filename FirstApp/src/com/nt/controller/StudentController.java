package com.nt.controller;

import com.nt.dto.StudentDto;
import com.nt.service.StudentService;
import com.nt.vo.StudentVo;

public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}
       public StudentDto generateResult(String sname,String city,String dist) {
    	   StudentVo vo=new StudentVo();
    	   vo.setSname(sname);
    	   vo.setCity(city);
    	   vo.setDist(dist);
    	   
    	   //Convert vo obj to dto
    	  StudentDto dto=new StudentDto();
    	  dto.setSname(vo.getSname());
    	  dto.setCity(vo.getCity());
    	  dto.setDist(vo.getDist());
    	  
    	  
		return dto;
    	   
       }
}
