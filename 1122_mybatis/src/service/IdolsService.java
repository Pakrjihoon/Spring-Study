package service;

import java.util.List;

import vo.Idol;

public interface IdolsService {
	public List<Idol> list();
	public int add(Idol idol);
}
