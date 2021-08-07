package com.example.junit.mockito.MockitoExmple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MockitoExmpleApplicationTests {
	
	@Autowired
	FindMaxNumberService  service;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	void testfindMaxNumber() {
		assertEquals(service.findMaxNumber(),500);
	}
	

}
