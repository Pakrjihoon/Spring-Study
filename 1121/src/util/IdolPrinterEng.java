package util;

import vo.Idol;

public class IdolPrinterEng implements IdolPrinter{
	
	public void printIdol(Idol idol) {
		
		System.out.println("No : "+idol.getNo()+" / Name : "+
		idol.getName()+" / Age : "+idol.getAge());
		
	} // printIdol() end
	
} // IdolPrinter end 
