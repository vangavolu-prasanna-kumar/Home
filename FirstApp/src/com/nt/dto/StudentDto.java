package com.nt.dto;

import java.io.Serializable;

public class StudentDto implements Serializable {
	private String sname;
	private String city;
	private String dist;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	@Override
	public String toString() {
		return "StudentDto [sname=" + sname + ", city=" + city + ", dist=" + dist + "]";
	}
	
	

}
