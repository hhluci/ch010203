package com.bee.sample.client;

import com.bee.sample.service.UserClientService;
import com.bee.sample.service.impl.UserClientServiceImpl;
import com.bee.sample.util.BeanFactory;

/**
 * 
 * �������3��ʹ�������ļ���������������
 * ��һ�����⣺spring �Ľ��������ʲô��
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
