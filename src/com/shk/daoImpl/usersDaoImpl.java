package com.shk.daoImpl;

import java.util.List;

import com.shk.dao.usersDao;
import com.shk.entity.mUser;
import com.shk.util.DBUtil;
import com.shk.util.PageData;

/**
 * �û�DAO��ʵ����
 * 
 * @author ����    2018/6/2 20:00
 *
 */
public class usersDaoImpl implements usersDao {

	
	/**
	 * �û����ӷ�����ʵ��
	 */
	@Override
	public boolean addUsers(mUser users) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into M_USER values(?,?,?,?,?,?,?)", users.getUSER_ID(), users.getUSER_NAME(),
				users.getUSER_PASSWORD(), users.getUSER_LEVEL(), users.getUSER_LOVE(), users.getUSER_PHOTO(),
				users.getUSER_EMAIL()) > 0;
	}

	/**
	 * �û�ɾ��������ʵ��
	 */
	@Override
	public boolean delUsers(int usersId) {
		// TODO Auto-generated method stub
		return DBUtil.execute("delete from M_USER where USER_ID=?", usersId) > 0;
	}

	/**
	 * �û��޸ķ�����ʵ��
	 */
	@Override
	public boolean updateUsers(mUser users) {
		// TODO Auto-generated method stub
		return DBUtil.execute(
				"update M_USER set USER_NAME=?,USER_PASSWORD=?,USER_LEVEL=?,USER_PHOTO=?,USER_EMAIL=?,USER_LOVE=? where USER_ID=?",
				users.getUSER_NAME(), users.getUSER_PASSWORD(), users.getUSER_LEVEL(),
				users.getUSER_PHOTO(), users.getUSER_EMAIL(), users.getUSER_LOVE(), users.getUSER_ID()) > 0;
	}

	/**
	 * �û���ҳ��ѯ��ʵ��
	 */
	@Override
	public PageData<mUser> queryUsers(int page, int pagesize, String usersNameLike) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		PageData<mUser> user = DBUtil.getPage("select*from M_USER where USER_NAME like ? ORDER BY USER_ID", page,
				pagesize, mUser.class, "%" + usersNameLike + "%");
		if (null != user) {
			return user;
		}
		return null;
	}

	/**
	 * ����û���¼�Ƿ�ɹ���ʵ��
	 */
	@Override
	public mUser queryUsersByNameAndPwd(String userName, String userPwd) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<mUser> list = (List<mUser>) DBUtil.select("select * from M_USER where USER_NAME=? and USER_PASSWORD=?",
				mUser.class, userName, userPwd);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

	/**
	 * ͨ���û���Ѱ���û���ʵ��
	 */
	@Override
	public mUser queryUsersByName(String userName) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<mUser> list = (List<mUser>) DBUtil.select("select * from M_USER where USER_NAME=?", mUser.class, userName);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

}
