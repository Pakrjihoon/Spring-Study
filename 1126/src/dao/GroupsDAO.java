package dao;

import java.util.List;

import vo.Group;

public interface GroupsDAO {
	public List<Group> selectList();
	public Group selectOne(int groupId);
}
