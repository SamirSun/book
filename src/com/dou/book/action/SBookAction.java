package com.dou.book.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dou.book.data.ISBookMapper;
import com.dou.book.data.pojo.SBook;
import com.dou.book.data.services.ISBookServices;



@SuppressWarnings("unchecked")
public class SBookAction {
	@Autowired
	ISBookServices bookServices;
	private SBook sbook;
	private String tips;
	private String bookId;
	private List bookList;

	/**
	 * ���ͼ����Ϣ
	 * 
	 * @return ��������Ƿ�ɹ�
	 */
	public String addSBook() {
		String result = "error";
		try {
			bookServices.saveBook(sbook);
			this.setTips("��ӳɹ�");
			result = "success";
		} catch (Exception e) {
			e.printStackTrace();
			this.setTips("ϵͳ��������");
		}
		return result;
	}

	/**
	 * �鿴����ͼ��
	 * 
	 * @return
	 */
	public String viewSBook() {
		String result = "error";
		try {
			bookList = bookServices.findAllBook();
			result = "success";
		} catch (Exception e) {
			e.printStackTrace();
			this.setTips("ϵͳ�������⣬���Ժ����");
		}
		return result;
	}

	/**
	 * �޸�ͼ����Ϣ
	 * 
	 * @return
	 */
	/*public String modifySBook() {
		String result = "error";
		try {
			sbook = sbookServices.getBookById(Integer
					.parseInt(this.getBookId()));
			result = "success";
		} catch (Exception e) {
			e.printStackTrace();
			this.setTips("ϵͳ��������");
		}
		return result;
	}
*/
	/*public String updateSBook() {
		String result = "error";
		try {
			sbookServices.updateBook(sbook);
			result = "success";
		} catch (Exception e) {
			e.printStackTrace();
			this.setTips("���²���ʧ��");
		}
		return result;
	}*/

	/**
	 * ɾ��ͼ��
	 * 
	 * @return
	 */
/*	public String removeSBook() {
		String result = "error";
		try {
			sbookServices.removeBook(Integer.parseInt(this.getBookId()));
			result = "success";
		} catch (Exception e) {
			e.printStackTrace();
			this.setTips("ɾ������ʧ��");
		}
		return result;
	}*/

	public SBook getSbook() {
		return sbook;
	}

	public void setSbook(SBook sbook) {
		this.sbook = sbook;
	}

	public List getBookList() {
		return bookList;
	}

	public void setBookList(List bookList) {
		this.bookList = bookList;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
}
