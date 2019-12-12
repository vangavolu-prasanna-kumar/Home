package com.nt.service;

import com.nt.bo.StudentBo;
import com.nt.dao.StudentDao;
import com.nt.dto.StudentDto;

public class StudentServiceimpl implements StudentService {
	
	private StudentDao dao;
	
	public StudentServiceimpl(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public StudentDto generateResult(StudentDto dto) {
		StudentBo bo=new StudentBo();
	     bo.setSname(dto.getSname());
	     bo.setCity(dto.getCity());
	     bo.setDist(dto.getDist());
	     
		return dto;
	}	     
	}

	


