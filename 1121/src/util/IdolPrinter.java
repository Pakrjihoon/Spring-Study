package util;

import vo.Idol;

public interface IdolPrinter {
	public String KOREA = "ko";
	public String ENGLISH = "eng";
	public String JAPAN = "jpn";
	
	public void printIdol(Idol idol);
}