package com.shk.dao;

import com.shk.entity.Users;
import com.shk.util.PageData;

/**
 * �û����DAO
 * 
 * @author Administrator
 *
 */
public interface usersDao {

	/**
	 * �û������Ӳ������󷽷�
	 * 
	 * @param users
	 *            ����һ���û�����
	 * @return
	 */
	public boolean addUsers(Users users);

	/**
	 * �û���ɾ���������󷽷�
	 * 
	 * @param usersId
	 *            �����û�ID
	 * @return
	 */
	public boolean delUsers(int usersId);

	/**
	 * �û����޸Ĳ������󷽷�
	 * 
	 * @param users
	 *            ����һ���û�����
	 * @return
	 */
	public boolean updateUsers(Users users);

	/**
	 * �û��ķ�ҳ��ѯ���󷽷�
	 * 
	 * @param page
	 *            ����һ��ҳ��
	 * @param pagesize
	 *            ����ÿҳ���е�������
	 * @param usersNameLike
	 *            ����Ҫ���ҵ��û����ؼ���
	 * @return
	 */
	public PageData<Users> queryUsers(int page, int pagesize, String usersNameLike);

	/**
	 * ����û���¼�ĳ��󷽷�
	 * 
	 * @param userName
	 *            �����û���
	 * @param userPwd
	 *            �����û�����
	 * @return
	 */
	public Users queryUsersByNameAndPwd(String userName, String userPwd);

	/**
	 * ͨ�����ֲ�ѯ�û���Ϣ�ĳ��󷽷�
	 * 
	 * @param userName
	 *            �����û���
	 * @return
	 */
	public Users queryUsersByName(String userName);
}
