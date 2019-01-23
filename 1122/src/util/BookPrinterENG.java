package util;

import vo.Book;

public class BookPrinterENG implements BookPrinter{
	
	//의존성은 멤버필드로
	private Book book;
	
	//주입받기 위해서 setter
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public void pirntBook() {
		
		System.out.println("No : "+book.getNo() + 
				" / Title : "+book.getTitle() + 
				" / Author : "+book.getAuthor());
		
	} // printBook() end
}
