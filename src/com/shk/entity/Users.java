package com.shk.entity;

/**
 * �û�ʵ����
 * 
 * @author ���� 2018/6/5 14:30
 *
 */
public class Users {

	private int USERID; // �û����
	private String USERNAME; // �û�
	private String USERPASSWORD; // �û�����
	private int USERLEVEL; // �û��ȼ���1:��ͨ�û�;2:����Ա��
	private String USEREMAIL; //�û�����
	private String USERLOVE;  //�û�ϲ��
	private String USERPHOTO; // �û���Ƭ

	// �޲ι���
	public Users() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "mUser [USERID=" + USERID + ", USERNAME=" + USERNAME + ", USERPASSWORD=" + USERPASSWORD
				+ ", USERLEVEL=" + USERLEVEL + ", USEREMAIL=" + USEREMAIL + ", USERLOVE=" + USERLOVE
				+ ", USERPHOTO=" + USERPHOTO + "]";
	}

	/**
	 * �����û���ŵ��вι���
	 * 
	 * @param uSERNAME
	 *             �û���
	 * @param uSERPASSWORD
	 *             �û�����
	 * @param uSERLEVEL
	 *             �û��ȼ���1:��ͨ�û�;2:����Ա��
	 * @param uSEREMAIL
	 *             �û�����
	 * @param uSERLOVE
	 *             �û�ϲ��
	 * @param uSERPHOTO
	 *             �û���Ƭ
	 */
	public Users(String uSERNAME, String uSERPASSWORD, int uSERLEVEL, String uSEREMAIL, String uSERLOVE, String uSERPHOTO) {
		super();
		USERNAME = uSERNAME;
		USERPASSWORD = uSERPASSWORD;
		USERLEVEL = uSERLEVEL;
		USEREMAIL = uSEREMAIL;
		USERLOVE = uSERLOVE;
		USERPHOTO = uSERPHOTO;
	}


	/**
	 * �вι���
	 * 
	 * @param uSERID
	 *             �û����
	 * @param uSERNAME
	 *             �û�
	 * @param uSERPASSWORD
	 *             �û�����
	 * @param uSER_LEVE
	 *             �û��ȼ���1:��ͨ�û�;2:����Ա��
	 * @param uSEREMAIL
	 *             �û�����
	 * @param uSERLOVE
	 *             �û�ϲ��
	 * @param uSERPHOTO
	 *             �û���Ƭ
	 */
	public Users(int uSERID, String uSERNAME, String uSERPASSWORD, int uSERLEVEL,String uSEREMAIL, String uSERLOVE, String uSERPHOTO) {
		super();
		USERID = uSERID;
		USERNAME = uSERNAME;
		USERPASSWORD = uSERPASSWORD;
		USERLEVEL = uSERLEVEL;
		USEREMAIL = uSEREMAIL;
		USERLOVE = uSERLOVE;
		USERPHOTO = uSERPHOTO;
	}



	public int getUSERID() {
		return USERID;
	}



	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}



	public String getUSERNAME() {
		return USERNAME;
	}



	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}



	public String getUSERPASSWORD() {
		return USERPASSWORD;
	}



	public void setUSERPASSWORD(String uSERPASSWORD) {
		USERPASSWORD = uSERPASSWORD;
	}



	public int getUSERLEVEL() {
		return USERLEVEL;
	}



	public void setUSERLEVEL(int uSERLEVEL) {
		USERLEVEL = uSERLEVEL;
	}



	public String getUSEREMAIL() {
		return USEREMAIL;
	}



	public void setUSEREMAIL(String uSEREMAIL) {
		USEREMAIL = uSEREMAIL;
	}



	public String getUSERLOVE() {
		return USERLOVE;
	}



	public void setUSERLOVE(String uSERLOVE) {
		USERLOVE = uSERLOVE;
	}



	public String getUSERPHOTO() {
		return USERPHOTO;
	}



	public void setUSERPHOTO(String uSERPHOTO) {
		USERPHOTO = uSERPHOTO;
	}

	

}
