package com.example.demo.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PrdVO {

	int productId;
	String productName;
	int productPrice;
	String productInfo;
	Date ProductDate;
	String company;
	String managerId;
}
