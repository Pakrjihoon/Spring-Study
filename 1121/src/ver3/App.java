package ver3;

import util.IdolPrinterEng;
import util.IdolPrinterKor;
import vo.Idol;

public class App {
	public static void main(String[] args) {
		Idol idol = new Idol(1,26,"송민호");
		
		IdolPrinterEng printerKor = new IdolPrinterEng();
		printerKor.printIdol(idol);
	} // main() end 
} //App end
