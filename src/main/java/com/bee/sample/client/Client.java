package com.bee.sample.client;

import com.bee.sample.service.UserClientService;
import com.bee.sample.service.impl.UserClientServiceImpl;
import com.bee.sample.util.BeanFactory;

/**
 * 
 * 解耦策略3：使用配置文件解耦工厂类和其他类
 * 下一个问题：spring 的解耦策略是什么？
 * @author hhluci
 *
 */
public class Client {

	public static void main(String[] args) {
		//UserClientService userClientService = new UserClientServiceImpl();

		//UserClientService userClientService = BeanFactory.getUserClientService();
		UserClientService userClientService = 
				BeanFactory.getBean("UserClientService") instanceof UserClientService? 
						(UserClientService)BeanFactory.getBean("UserClientService"):null;
		userClientService.saveCustom();
	}

}
