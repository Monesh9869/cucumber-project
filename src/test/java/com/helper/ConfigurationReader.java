package com.helper;

import java.io.IOException;

public class ConfigurationReader {
	
	public FileReader getFrInstance() throws IOException {
		FileReader fr = new FileReader();
		return fr;
		

	}
	public static ConfigurationReader getCrInstance() {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
		

	}
	public ConfigurationReader() {
	}

}
