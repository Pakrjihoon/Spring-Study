package vo;

import java.sql.Date;

public class Book {
	
	private int no;
	private String title, image, author;
	private Date publicationDate;
	
	public Book() {
		
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
}
