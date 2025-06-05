package com.example.demo.mapper;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class TimeMapperTest {
	
	@Autowired TimeMapper timemapper;
	
	@Test
	public void getTime() {
		log.info(timemapper.getTime2());
	}
}
