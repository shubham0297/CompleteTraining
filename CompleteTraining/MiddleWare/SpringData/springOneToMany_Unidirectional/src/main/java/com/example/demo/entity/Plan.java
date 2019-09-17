package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vayutel_plans")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Plan {

	@Id
	private long planId;
	private String code;
	private String validity;
	private double amount;
	private LocalDate effectiveDate;
}
