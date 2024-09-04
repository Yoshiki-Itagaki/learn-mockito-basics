package com.in28minutes.mockito.mockito_demo.business;

public class SomeBusinessImpl {
	
	private DataService dataService;	
	
	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatestValue = Integer.MIN_VALUE;
		
		for(int value:data) {
			if(value > greatestValue) {
				greatestValue = value;
			}
		}
		
		return value;		
	}
}

interface DataService {
	int[] retrieveAllData();
}