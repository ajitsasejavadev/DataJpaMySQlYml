package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emptab")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	private Integer empId;
	private String empName;
	private Double empSal;
	private Integer panId;
}
