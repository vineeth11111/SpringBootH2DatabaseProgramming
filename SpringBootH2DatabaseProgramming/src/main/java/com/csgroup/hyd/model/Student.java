package com.csgroup.hyd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="emp_tab")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private int id;
	
	@NonNull
	private String name;
	
	@NonNull
	private String branch;
	
	@NonNull
	private Double fee;
}
