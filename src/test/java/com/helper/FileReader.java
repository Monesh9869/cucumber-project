package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReader {
	
	public static Properties p;
	
	public FileReader() throws IOException {
		
		File f = new File("C:\\Users\\TGS CONS\\eclipse-workspace\\CucumberLearn\\src\\test\\java\\com\\fbproperty\\data.property");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
	}
	public String getUrl() {
		String UrlValue = p.getProperty("url");
		System.out.println(UrlValue);
		return UrlValue;

	}
	public  String getBrowser() {
		String Bname = p.getProperty("browserName");
		System.out.println(Bname);
		return Bname;

	}
	
		
	}


