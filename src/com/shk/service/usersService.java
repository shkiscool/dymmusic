package com.shk.service;

import com.shk.entity.mUser;
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
	public boolean addUsers(mUser users);

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
	public boolean updateUsers(mUser users);

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
	public PageData<mUser> getUsers(int page, int pagesize, String usersNameLike);

	/**
	 * ʵ���û���¼���ܵĳ��󷽷�
	 * 
	 * @param userName
	 *            �����û���
	 * @param userPwd
	 *            �����û�����
	 * @return
	 */
	public mUser login(String userName, String userPwd);

	/**
	 * ʵ��ͨ�����ֲ����û��ĳ��󷽷�
	 * 
	 * @param userName
	 *            �����û���
	 * @return
	 */
	public mUser getUserByName(String userName);
}
