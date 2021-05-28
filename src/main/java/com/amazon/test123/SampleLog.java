package com.amazon.test123;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = LogManager.getLogger(SampleLog.class);
		
		logger.info("Hi the weather is too good");
		logger.info("Git it Great");
	}

}
