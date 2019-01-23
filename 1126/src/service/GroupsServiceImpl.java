package service;

import java.util.List;

import dao.GroupsDAO;
import vo.Group;

public class GroupsServiceImpl implements GroupsService{
	private GroupsDAO groupsDAO;
	
	public void setGroupsDAO(GroupsDAO groupsDAO) {
		this.groupsDAO = groupsDAO;
	}

	@Override
	public List<Group> groupList() {
		return groupsDAO.selectList();
	}

	@Override
	public Group groupDetail(int groupId) {
		// TODO Auto-generated method stub
		return groupsDAO.selectOne(groupId);
	}
}
