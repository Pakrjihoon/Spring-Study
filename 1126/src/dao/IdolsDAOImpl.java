package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.Idol;

public class IdolsDAOImpl implements IdolsDAO {

	private SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	@Override
	public List<Idol> selectList() {
		// TODO Auto-generated method stub
		return session.selectList("idols.selectList");
	}
	@Override
	public Idol selectOne(int idolId) {
		// TODO Auto-generated method stub
		return session.selectOne("idols.selectOne",idolId);
	}

}
