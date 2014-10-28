package net.martenscs.cxf.bookstore;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BookShelfService {

	@WebMethod
	public String insertBook(BookVO bookVO);

	@WebMethod
	public BookVO getBook(String title);
}