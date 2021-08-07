package com.example.junit.mockito.MockitoExmple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FindMaxNumberMockTest {
	@Mock
	DataServiceDAO dataServiceMock;
	
	@InjectMocks
	FindMaxNumberService findMax;
	
	@Test
	void testFindMaxNumber() {
		Mockito.when(dataServiceMock.retriveData()).thenReturn(new int[] {24,5,2,44,3});
		int result = findMax.findMaxNumber();
		assertEquals(44, result);
	}
	
	
	@Test
	void testFindMaxNumber1() {
		Mockito.when(dataServiceMock.retriveData()).thenReturn(new int[] {24});
		int result = findMax.findMaxNumber();
		assertEquals(24, result);
	}
	
	
	
	@Test
	void testFindMaxNumber2() {
		Mockito.when(dataServiceMock.retriveData()).thenReturn(new int[] {});
		int result = findMax.findMaxNumber();
		assertEquals(Integer.MIN_VALUE,result);
	}
}

