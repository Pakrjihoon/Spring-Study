package service;

import java.util.List;

import vo.Group;

public interface GroupsService {
	public List<Group> groupList();
	public Group groupDetail(int groupId);
}
