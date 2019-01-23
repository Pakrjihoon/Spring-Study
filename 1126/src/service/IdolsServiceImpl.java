package service;

import java.util.List;

import dao.IdolsDAO;
import vo.Idol;

public class IdolsServiceImpl implements IdolsService{

	private IdolsDAO idolDAO;
	public void setIdolDAO(IdolsDAO idolDAO) {
		this.idolDAO = idolDAO;
	}
	@Override
	public List<Idol> IdolList() {
		// TODO Auto-generated method stub
		return idolDAO.selectList();
	}
	@Override
	public Idol IdolDetail(int idolId) {
		// TODO Auto-generated method stub
		return idolDAO.selectOne(idolId);
	}

}
