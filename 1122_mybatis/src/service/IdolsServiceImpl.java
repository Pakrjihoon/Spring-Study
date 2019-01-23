package service;

import java.util.List;

import dao.IdolsDAO;
import vo.Idol;

public class IdolsServiceImpl implements IdolsService{
	private IdolsDAO idolsDAO;
	public void setIdolsDAO(IdolsDAO idolsDAO) {
		this.idolsDAO = idolsDAO;
	}
	@Override
	public List<Idol> list() {
		// TODO Auto-generated method stub
		return idolsDAO.selectList();
	}
	@Override
	public int add(Idol idol) {
		// TODO Auto-generated method stub
		return idolsDAO.insert(idol);
	}
}
