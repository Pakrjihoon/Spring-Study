package dao;

import java.util.List;
import vo.Idol;

public interface IdolsDAO {
	public List<Idol> selectList();
	public int insert(Idol idol);
}
