package com.shk.daoImpl;

import java.util.List;

import com.shk.dao.usersDao;
import com.shk.entity.Users;
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
	public boolean addUsers(Users users) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into MUSER values(?,?,?,?,?,?,?)", users.getUSERID(), users.getUSERNAME(),
				users.getUSERPASSWORD(), users.getUSERLEVEL(), users.getUSERLOVE(), users.getUSERPHOTO(),
				users.getUSEREMAIL()) > 0;
	}

	/**
	 * �û�ɾ��������ʵ��
	 */
	@Override
	public boolean delUsers(int usersId) {
		// TODO Auto-generated method stub
		return DBUtil.execute("delete from MUSER where USER_ID=?", usersId) > 0;
	}

	/**
	 * �û��޸ķ�����ʵ��
	 */
	@Override
	public boolean updateUsers(Users users) {
		// TODO Auto-generated method stub
		return DBUtil.execute(
				"update MUSER set USERNAME=?,USERPASSWORD=?,USERLEVEL=?,USERPHOTO=?,USEREMAIL=?,USERLOVE=? where USERID=?",
				users.getUSERNAME(), users.getUSERPASSWORD(), users.getUSERLEVEL(),
				users.getUSERPHOTO(), users.getUSEREMAIL(), users.getUSERLOVE(), users.getUSERID()) > 0;
	}

	/**
	 * �û���ҳ��ѯ��ʵ��
	 */
	@Override
	public PageData<Users> queryUsers(int page, int pagesize, String usersNameLike) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		PageData<Users> user = DBUtil.getPage("select*from MUSER where USERNAME like ? ORDER BY USERID", page,
				pagesize, Users.class, "%" + usersNameLike + "%");
		if (null != user) {
			return user;
		}
		return null;
	}

	/**
	 * ����û���¼�Ƿ�ɹ���ʵ��
	 */
	@Override
	public Users queryUsersByNameAndPwd(String userName, String userPwd) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Users> list = (List<Users>) DBUtil.select("select * from MUSER where USERNAME=? and USERPASSWORD=?",
				Users.class, userName, userPwd);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

	/**
	 * ͨ���û���Ѱ���û���ʵ��
	 */
	@Override
	public Users queryUsersByName(String userName) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Users> list = (List<Users>) DBUtil.select("select * from MUSER where USERNAME=?", Users.class, userName);
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

}
