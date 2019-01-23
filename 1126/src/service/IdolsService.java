package service;

import java.util.List;

import vo.Idol;

public interface IdolsService {
	public List<Idol> IdolList();
	public Idol IdolDetail(int idolId);
}
