package com.rrk.learnspringframework.businessCalculationApplicationLauncher;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService{

	public int[] retrieveData() {
		return new int[] {1, 2, 3, 4, 5};
	}

}
