package com.shk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.shk.entity.mUser;
import com.shk.service.usersService;
import com.shk.serviceImpl.usersServiceImpl;
import com.shk.util.PageData;

/**
 * �û���˿�����
 * 
 * @author ����    2018/6/2 20:00
 *
 */
@WebServlet("/UsersController")
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// ����Service����
	usersService us = new usersServiceImpl();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      �ж�ִ���ĸ�����
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// ������ op ֵ������� list������ѯ
		String op = request.getParameter("op");
		System.out.println(op);

		if ("ajax".equals(op)) {
			doAjax(request, response);
		} else if ("sign".equals(op)) {
			doSign(request, response);
		} else if ("login".equals(op)) {
			doLogin(request, response);
		} else if ("list".equals(op)) {
			doList(request, response);
		} else if ("add".equals(op)) {
			doAdd(request, response);
		} else if ("del".equals(op)) {
			doDel(request, response);
		} else if ("udp".equals(op)) {
			doUpd(request, response);
		}
	}

	/**
	 * ִ���û����޸Ĳ���
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doUpd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String USER_EMAIL = ""; // �û��������ַ
		String USER_LOVE = ""; // �û�������ϲ��
		String userId = request.getParameter("userId");
		int USER_ID = Integer.parseInt(userId); // �û��ı��
		String USER_NAME = request.getParameter("userName"); // �û���
		String USER_PASSWORD = request.getParameter("userPwd"); // �û�����
		String userLevel = request.getParameter("userLevel");
		int USER_LEVEL = Integer.parseInt(userLevel); // �û�Ȩ��
		String USER_PHOTO = request.getParameter("userPhoto"); // �û�ͼƬ·��
		String userLove = request.getParameter("userLove");
		System.out.println(userLove);
		if (null != userLove) {
			USER_LOVE = userLove;
		}
		String userEmail = request.getParameter("userEmail");
		if (null != userEmail) {
			USER_EMAIL = userEmail;
		}
		mUser users = new mUser(USER_ID, USER_NAME, USER_PASSWORD, USER_LEVEL, USER_EMAIL, USER_LOVE, USER_PHOTO);
		boolean flag = us.updateUsers(users);
		PrintWriter out = response.getWriter();
		if (flag) {
			out.print("true");
		}
		out.close();
	}

	/**
	 * ִ���û���ɾ������
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doDel(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId");  //����ҳ�˻�ȡ����Ա��Ҫɾ���û���ID
		boolean flag = us.delUsers(Integer.parseInt(userId));
		PrintWriter out = response.getWriter();
		if (flag) {
			out.print("true");
		}
		out.close();
	}

	/**
	 * ִ���û������Ӳ���
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doAdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PageData<mUser> pd = us.getUsers(1, 1, "");
		int USER_ID = pd.getTotal() + 1;  //���û����л�ȡ�û�������Ȼ���һ����¼��û��ı�ţ���ȱ�ݣ��м䲻�ܸ��ϣ�
		String USER_PHOTO = "";  //�û���Ƭ�����ӵ�ַ
		String USER_LOVE = "";  //�û�������ϲ��
		int USER_LEVEL = 1; //�û�Ȩ�ޣ�һ��Ĭ��Ϊ��ͨ�û��������ʵ�Ƕ����~~��
		String USER_EMAIL = "";  //�û��������ַ
		String userLove = request.getParameter("userLove");
		if (null != userLove) {
			USER_LOVE = userLove;
		}
		String userId = request.getParameter("userId");
		if (null != userId) {
			USER_ID = Integer.parseInt(userId);
		}
		String USER_NAME = request.getParameter("userName");  //����ҳ�˻�ȡ�û���
		String USER_PWD = request.getParameter("userPwd");  //����ҳ�˻�ȡ�û�����
		String userLevel = request.getParameter("userLevel"); //����ҳ�˻�ȡ���õ��û�Ȩ������

		if (null != userLevel) {
			USER_LEVEL = Integer.parseInt(userLevel);
		}

		String userEmail = request.getParameter("userEmail");
		if (null != userEmail) {
			USER_EMAIL = userEmail;
		}
		mUser users = new mUser(USER_ID, USER_NAME, USER_PWD, USER_LEVEL, USER_EMAIL, USER_LOVE, USER_PHOTO);
		boolean flag = us.addUsers(users);
		PrintWriter out = response.getWriter();
		if (flag) {
			out.print("true");
		}
		out.close();
	}

	/**
	 * ִ���û��ķ�ҳ��ѯ����
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int page = 1;  //��ʼҳ��Ϊ1��Ҳ���ǵ�һҳ
		int pagesize = 5;  //��ʼÿҳ�����������������õ���һҳ�����û�����
		String userNameLike = "";  //ģ����ѯ�ĳ�ʼ����ֵΪ"";�������Բ�ѯ��������

		//����ҳ�˻�ȡ����Ա�����ҳ����
		if (null != request.getParameter("Userpage")) {
			page = Integer.parseInt(request.getParameter("Userpage"));

			if (page < 1) {
				page = 1;
			}

		}

		//����ҳ�˻�ȡ����Ա���õ�ÿҳ��������Ϣ����ʵ����Ƕ���ģ���Ϊ��û�и�����Ա����ҳ���������Ĵ��ڣ�
		if (null != request.getParameter("pagesize")) {
			pagesize = Integer.parseInt(request.getParameter("pagesize"));
		}

		//����ҳ�˻�ȡ����Ա��ѯ��ʹ�õĹؼ���
		if (null != request.getParameter("userNameLike")) {
			userNameLike = request.getParameter("userNameLike");
		}

		PageData<mUser> pd = us.getUsers(page, pagesize, userNameLike);

		request.setAttribute("pd", pd);

		request.setAttribute("userNameLike", userNameLike);

		request.setAttribute("userLike", userNameLike);

		request.getRequestDispatcher("mvc/userList.jsp").forward(request, response);
	}

	/**
	 * ִ���û��ĵ�¼����
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		// ����userService�ķ���
		mUser u = us.login(userName, userPwd);
		if (u.getUSER_LEVEL() == 2) {
			// ���û���Ϣ�洢��session������
			session.setAttribute("users", u);
			// ת�����û���̨
			request.getRequestDispatcher("mvc/Behinddesk.jsp").forward(request, response);
		} else {
			// ���û���Ϣ�洢��session������
			session.setAttribute("users", u);
			// δ��¼�Ļ�������ͨ�û���ת����ǰ̨����
			request.getRequestDispatcher("#").forward(request, response);
		}
	}

	/**
	 * ִ���û���ע�����
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doSign(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PageData<mUser> pd = us.getUsers(1, 1, "");
		int USER_ID = pd.getTotal() + 1;   //���û����л�ȡ�û�������Ȼ���һ����¼��û��ı�ţ���ȱ�ݣ��м䲻�ܸ��ϣ�
		int USER_LEVEL = 1;  //�û�Ȩ�ޣ�һ��Ĭ��Ϊ��ͨ�û��������ʵ�Ƕ����~~��
		String USER_LOVE = "";  //ע�����û�иô�������Ϊ��
		String USER_PHOTO = "";  //ע�����û�иô�������Ϊ��
		String USER_EMAIL = "";  //�����ʵҲ�Ƕ���ģ���Ϊ��¼�����������EMAIL��ַ����ע��ɹ�
		String USER_NAME = request.getParameter("userName");  //����ҳ�˻�ȡ�û���
		String USER_PWD = request.getParameter("userPwd");  //����ҳ�˻�ȡ�û�����
		String userEmail = request.getParameter("userEmail");  //����ҳ�˻�ȡEMAIL��ַ
		if (null != userEmail) {
			USER_EMAIL = userEmail;
		}
		mUser users = new mUser(USER_ID, USER_NAME, USER_PWD, USER_LEVEL, USER_EMAIL, USER_LOVE, USER_PHOTO);

		boolean flag = us.addUsers(users);  //ִ�����Ӳ���

		request.setAttribute("Usignflag", flag);
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * ִ��ajax����,�ڵ�¼�ɹ�֮ǰ,ʵ�ֶ��û���ʾ�ľֲ�ˢ��;�������˵�¼ҳ���ע��ҳ�棩
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doAjax(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ap = request.getParameter("ap");
		PrintWriter out = response.getWriter();
		if ("au".equals(ap)) {   //��ap=auʱ��ִ�в�ѯ�������ж��û��������ݿ����Ƿ����
			String username = request.getParameter("username");
			mUser uss = us.getUserByName(username);
			if (null != uss) {
				out.print("�û����Ѵ��ڣ�");
			}
		} else if ("aw".equals(ap)) {  //��ap=aw ʱ���ж���������������Ƿ�һ��
			String password = request.getParameter("password");
			String repassword = request.getParameter("repassword");
			if (!password.equals(repassword)) {
				out.print("������������벻һ�£����������룡");
			}
		} else if ("login".equals(ap)) {  //��ap=loginʱ��ִ�е�¼�������ж��û����������Ƿ���ȷ
			String userName = request.getParameter("userName");
			String userPwd = request.getParameter("userPwd");
			mUser u = us.login(userName, userPwd);
			if (null == u) {
				out.print("�û������������");
			}
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
