package ver4;

import util.IdolPrinter;
import util.IdolPrinterJPN;

import vo.Idol;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Idol idol = new Idol(1,26,"송민호");
		IdolPrinter printer = new IdolPrinterJPN();
		
		printer.printIdol(idol);
		
	}

}
