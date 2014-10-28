package net.martenscs.cxf.bookstore;


import javax.jws.WebService;

@WebService(endpointInterface = "net.martenscs.cxf.bookstore.BookShelfService", serviceName = "bookShelfService")
public class BookShelfServiceImpl implements BookShelfService {
	public String insertBook(BookVO bookVO) {
		HashDB.insertBook(bookVO);
		return "Book with name : " + bookVO.getBookName()
				+ " is now available on the shelf"; // To change body of
													// implemented methods use
													// File | Settings | File
													// Templates.
	}

	public BookVO getBook(String title) {

		return HashDB.getBook(title); // To change body of implemented methods
										// use File | Settings | File Templates.
	}
}