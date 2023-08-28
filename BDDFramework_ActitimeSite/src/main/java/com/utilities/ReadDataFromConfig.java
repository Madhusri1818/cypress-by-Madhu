package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromConfig {

	// This method is used to get data from config.pro file

	public Properties init_cofig() throws FileNotFoundException {

		FileInputStream Fis = new FileInputStream(
				"C:\\Users\\user\\Downloads\\BDDFramework_ActitimeSite\\Resources\\Config.properties");
		Properties p = new Properties();
		try {
			p.load(Fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(p.getProperty("Browser"));
		System.out.println(p.getProperty("ActiTimeUrl"));
		return p;
	}

	public static void main(String[] args) throws IOException {
		ReadDataFromConfig obj=new ReadDataFromConfig();
		obj.init_cofig();
	}

}
