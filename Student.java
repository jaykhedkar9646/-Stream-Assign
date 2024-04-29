package com.assign;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Student {

	private Integer s_Id;
	
	private String f_Name;
	
	private String l_Name;
	
	private String addrs;
	
	private Integer rank;
	
	private String dept;
	
	private String gender;
	
	private Integer age;

	public Student(int s_Id, String f_Name, String l_Name, String addrs, int rank, String dept, String gender,
			int age) {
		super();
		this.s_Id = s_Id;
		this.f_Name = f_Name;
		this.l_Name = l_Name;
		this.addrs = addrs;
		this.rank = rank;
		this.dept = dept;
		this.gender = gender;
		this.age = age;
	}
	
	
}
