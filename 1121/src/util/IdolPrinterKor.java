package util;

import vo.Idol;

public class IdolPrinterKor implements IdolPrinter{
	
	public void printIdol(Idol idol) {
		
		System.out.println("번호 : "+idol.getNo()+" / 이름 : "+
		idol.getName()+" / 나이 : "+idol.getAge());
		
	} // printIdol() end
	
} // IdolPrinter end 
