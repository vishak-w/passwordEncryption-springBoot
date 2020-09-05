package com.password.passDecode.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import lombok.Data;
import sun.net.ftp.FtpReplyCode;

@Data

@Entity
@Table(name="Student")
public class Student {
	@CreatedBy
	private String createdBy;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String age;
	
	@JoinColumn(name="aadr_ID")
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Address address;
	
	

}
