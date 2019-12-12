package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.controller.StudentController;
import com.nt.dto.StudentDto;
import com.nt.vo.StudentVo;

public class Client {
	public static void main(String[] args) {
  ApplicationContext ctx=new 
		  ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
  //get bean
  StudentController con=ctx.getBean("controller",StudentController.class);
  StudentVo vo=new StudentVo();
      System.out.println(con.generateResult("prasana k", "vinukonda","gunter"));
	}

}
