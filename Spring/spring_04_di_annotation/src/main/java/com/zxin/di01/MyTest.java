package com.zxin.di01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
	
	@Test
	public void test01() {
		String resource = "applicationContext1.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		Student student = (Student) ac.getBean("myStudent");
		System.out.println(student);
	}
	
}



















