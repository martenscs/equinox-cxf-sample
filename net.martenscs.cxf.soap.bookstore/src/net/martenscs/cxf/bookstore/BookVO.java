package net.martenscs.cxf.bookstore;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "Book")
public class BookVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2355351806999188310L;
	private long bookId;
	private String bookName;
	private String author;

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bucketId) {
		this.bookId = bucketId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}