package com.example.junit.mockito.MockitoExmple;


import org.springframework.stereotype.Service;

@Service
public class DataServiceDAOImpl implements DataServiceDAO {

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {100,200,300,400,500};
	}

}
