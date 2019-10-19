package com.bee.sample.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {

	private static Properties props = new Properties();
	static {
		InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
		try {
			props.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Object getBean(String beanName) {
		String beanPath = (String) props.get(beanName);
		Object object = null;
		try {
			object = Class.forName(beanPath).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	
}
