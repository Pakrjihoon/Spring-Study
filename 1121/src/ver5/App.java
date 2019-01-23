package ver5;

import factory.IdolPrinterFactory;
import util.IdolPrinter;
import vo.Idol;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Idol idol = new Idol(1,26,"송민호");
		IdolPrinter printer = IdolPrinterFactory.getPrinter("jpn");
		printer.printIdol(idol);
	} // main() end

} //App end
