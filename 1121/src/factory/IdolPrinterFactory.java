package factory;

import util.IdolPrinter;
import util.IdolPrinterEng;
import util.IdolPrinterJPN;
import util.IdolPrinterKor;
import vo.Idol;

public class IdolPrinterFactory {
	
	public static IdolPrinter getPrinter(String language) {
		IdolPrinter printer = null;
		// 만약 type이 ko면, 
		if(language.equals(IdolPrinter.KOREA)) {
			printer = new IdolPrinterKor();
		} else if(language.equals(IdolPrinter.ENGLISH)){
			printer = new IdolPrinterEng();
		} else if(language.equals(IdolPrinter.JAPAN)){
			printer = new IdolPrinterJPN();
		} // if~else end
		
		return printer;
	} //getPrinter() end
	
} //IdolPrinterFactory
