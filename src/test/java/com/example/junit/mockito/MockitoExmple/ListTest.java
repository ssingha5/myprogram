package com.example.junit.mockito.MockitoExmple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {
	@Test
	void testSizeOfList() {
		List listMock = mock(List.class);
		Mockito.when(listMock.size()).thenReturn(10);
		assertEquals(listMock.size(), 10);
	}
	
	@Test
	void testSizeOfListMultiple() {
		List listMock = mock(List.class);
		Mockito.when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(listMock.size(), 10);
		assertEquals(listMock.size(), 20);
	}

	
	@Test
	void testGetSpecificParam() {
		List listMock = mock(List.class);
		Mockito.when(listMock.get(0)).thenReturn("Sudipta");
		assertEquals("Sudipta", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	void testGetGenericParam() {
		List listMock = mock(List.class);
		Mockito.when(listMock.get(Mockito.anyInt())).thenReturn("Sudipta");
		assertEquals("Sudipta", listMock.get(0));
		assertEquals("Sudipta", listMock.get(1));
	}
}
