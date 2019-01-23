package ver2;

import util.IdolPrinterKor;
import vo.Idol;

public class App {
	
	public static void main(String[] args) {
		Idol idol = new Idol(1, 26, "송민호");

		IdolPrinterKor printer = new IdolPrinterKor();
		printer.printIdol(idol);
		printer.printIdol(new Idol(2, 28, "김진우"));
		printer.printIdol(new Idol(3, 27, "이승훈"));
		
		
	} // main() end 
} // App end 

