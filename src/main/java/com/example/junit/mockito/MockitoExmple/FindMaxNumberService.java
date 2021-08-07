package com.example.junit.mockito.MockitoExmple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindMaxNumberService {

	@Autowired
	DataServiceDAO service;
	

	public FindMaxNumberService(DataServiceDAO service){ 
		this.service = service; 
	}
	public int findMaxNumber() {
		int[] arr = service.retriveData();
		int max = Integer.MIN_VALUE;
		for(int num : arr) {
			if(num>max){
				max = num;
			}
		}
		return max;
	}
}


