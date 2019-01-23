package util;

import vo.Book;

public class BookPrinterKOR implements BookPrinter{
	
	private Book book;
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	@Override
	public void pirntBook() {
		
		System.out.println("번호 : "+book.getNo() + 
				" / 제목 : "+book.getTitle() + 
				" / 저자 : "+book.getAuthor());
		
	} // printBook() end
}
