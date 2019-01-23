package util;

import vo.Idol;

public class IdolPrinterJPN implements IdolPrinter{

	@Override
	public void printIdol(Idol idol) {
		// TODO Auto-generated method stub
		System.out.println("番号 : "+idol.getNo()+" / 名前 : "+
		idol.getName()+" / 年齢 : "+idol.getAge());
	}
	
}
