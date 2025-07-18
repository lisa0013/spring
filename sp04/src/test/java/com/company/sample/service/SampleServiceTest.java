package com.company.sample.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.Setter;

@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class SampleServiceTest {
	
	@Setter(onMethod_= {@Autowired})
	private SampleService sampleTxService;
	
	@Test
	public void test() {
		sampleTxService.sample("name");
	}
}
