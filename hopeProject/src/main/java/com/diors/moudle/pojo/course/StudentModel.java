package com.diors.moudle.pojo.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="base_student")
public class StudentModel {
	
	private Long userId;
	private String userName;
    private Integer age;
    
    
	public StudentModel(Long userId, String userName, Integer age) {
		this.userId = userId;
		this.userName = userName;
		this.age = age;
	}


	public StudentModel() {
		
	}

    @GenericGenerator(name = "generator", strategy = "native")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="user_id", unique=true, nullable=false)
	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "user_name")
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Column(name = "age")
	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}
    
    
    

}
