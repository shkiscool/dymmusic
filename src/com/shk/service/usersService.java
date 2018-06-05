package com.shk.service;

import com.shk.entity.Users;
import com.shk.util.PageData;

/**
 * �û���ҵ���
 * 
 * @author ����    2018/6/2 20:00
 *
 */
public interface usersService {

	/**
	 * ʵ�������û�ҵ��ĳ��󷽷�
	 * 
	 * @param users
	 *            ����һ���û�����
	 * @return
	 */
	public boolean addUsers(Users users);

	/**
	 * ʵ��ɾ���û�ҵ��ĳ��󷽷�
	 * 
	 * @param usersId
	 *            ����һ���û����
	 * @return
	 */
	public boolean delUsers(int usersId);

	/**
	 * ʵ���޸��û�ҵ��ĳ��󷽷�
	 * 
	 * @param users
	 *            ����һ���û�����
	 * @return
	 */
	public boolean updateUsers(Users users);

	/**
	 * ʵ���û���ҳ��ѯ�ĳ��󷽷�
	 * 
	 * @param page
	 *            ����һ��ҳ��
	 * @param pagesize
	 *            ����ÿҳ���е�������
	 * @param usersNameLike
	 *            ����Ҫ���ҵ��û����ؼ���
	 * @return
	 */
	public PageData<Users> getUsers(int page, int pagesize, String usersNameLike);

	/**
	 * ʵ���û���¼���ܵĳ��󷽷�
	 * 
	 * @param userName
	 *            �����û���
	 * @param userPwd
	 *            �����û�����
	 * @return
	 */
	public Users login(String userName, String userPwd);

	/**
	 * ʵ��ͨ�����ֲ����û��ĳ��󷽷�
	 * 
	 * @param userName
	 *            �����û���
	 * @return
	 */
	public Users getUserByName(String userName);
}
