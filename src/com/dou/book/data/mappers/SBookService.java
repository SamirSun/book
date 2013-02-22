package com.dou.book.data.mappers;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dou.book.data.ISBookMapper;
import com.dou.book.data.pojo.SBook;
@Service("sBookService")
public class SBookService implements BookService{
	//@Autowired ���� @Resource ������
	@Resource
	private ISBookMapper sBookMapper;

	public void saveBook(SBook sbook){
		sBookMapper.saveBook(sbook);
	}
}
