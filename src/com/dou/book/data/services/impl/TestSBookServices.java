package com.dou.book.data.services.impl;

import javax.servlet.ServletConfig;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import com.dou.book.data.mappers.SBookService;
import com.dou.book.data.pojo.SBook;

public class TestSBookServices {
	SBookService service = null;
	
	/**
	* A��@Before ע�⣺��junit3.x�е�setUp()��������һ������ÿ�����Է���֮ǰִ�У�
	* B��@After ע�⣺��junit3.x�е�tearDown()��������һ������ÿ�����Է���֮��ִ�У�
	* C��@BeforeClass ע�⣺�����з���ִ��֮ǰִ�У�
	* D��@AfterClass ע�⣺�����з���ִ��֮��ִ�У�
	* E��@Test(timeout = xxx) ע�⣺���õ�ǰ���Է�����һ��ʱ���������꣬���򷵻ش���(����)
	* F��@Test(expected = Exception.class) ע�⣺���ñ����Եķ����Ƿ����쳣�׳����׳��쳣����Ϊ��Exception.class��
	* G��@Ignore ע�⣺ע�͵�һ�����Է�����һ���࣬��ע�͵ķ������࣬���ᱻִ�С�
	*/

	
	@Before
	public void init() {
		System.out.println("chushihua...");
	}
	@After
	public void destory() {
		System.out.println("destory...");
	}
	@Test(timeout = 3000)
	public void testSaveBook(){
		long t1 = System.currentTimeMillis();
//		ApplicationContext aCtx = new FileSystemXmlApplicationContext(
//		"classpath:applicationContext-common.xml");
		
//		ApplicationContext aCtx = new ClassPathXmlApplicationContext(   
//		"classpath:applicationContext-common.xml"); 
		
		ApplicationContext aCtx = MyApplicationContextUtil.getContext();
		
		long t2 = System.currentTimeMillis();
		SBookService sBookService = (SBookService) aCtx
				.getBean("sBookService");
		long t3 = System.currentTimeMillis();
		SBook sbook = new SBook();
		sbook.setTitle("tt3");
		long t4 = System.currentTimeMillis();
		sBookService.saveBook(sbook);
		long t5 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		System.out.println(t3 - t2);
		System.out.println(t4 - t3);
		System.out.println(t5 - t4);
	}
	@Test(timeout = 3000)
	public void testSaveBook1(){
		long t1 = System.currentTimeMillis();
//		ApplicationContext aCtx = new FileSystemXmlApplicationContext(
//		"classpath:applicationContext-common.xml");
		
//		ApplicationContext aCtx = new ClassPathXmlApplicationContext(   
//		"classpath:applicationContext-common.xml"); 
		
		ApplicationContext aCtx = MyApplicationContextUtil.getContext();
		
		long t2 = System.currentTimeMillis();
		SBookService sBookService = (SBookService) aCtx
				.getBean("sBookService");
		long t3 = System.currentTimeMillis();
		SBook sbook = new SBook();
		sbook.setTitle("tt3");
		long t4 = System.currentTimeMillis();
		sBookService.saveBook(sbook);
		long t5 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		System.out.println(t3 - t2);
		System.out.println(t4 - t3);
		System.out.println(t5 - t4);
	}
}
