package net.martenscs.cxf.bookstore;

import java.util.HashMap;

public class HashDB {
	public static HashMap<String, BookVO> bookDB = new HashMap<String, BookVO>();
	public static int counter = 0;

	public static void insertBook(BookVO bookVO) {
		if (HashDB.bookDB.size() > 10000) {
			HashDB.bookDB.clear();
			counter++;
		}
		HashDB.bookDB.put(bookVO.getBookName(), bookVO);
	}

	public static BookVO getBook(String bookName) {
		return HashDB.bookDB.get(bookName);
	}

}