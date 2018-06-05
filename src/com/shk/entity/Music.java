package com.shk.entity;

/**
 * ����ʵ����
 * 
 * @author ���� 2018/6/2 16:30
 *
 */
public class Music {

	private int M_ID; // ���ֱ��
	private int T_ID; // �������ͱ��
	private int SCENEID; // ���ֳ������
	private int MODEID; // ���磨ƫ��ĳ�����飩���
	private int GENRE_ID; // ���ɱ��
	private int LANGUAGID; // �������ֱ��
	private int SINGERID; // ���ֱ��
	private String M_NAME; // ��������
	private String M_URL; // ��������·��
	private int M_COUNT; // ���ֵ������
	private String M_LYRIC; // ���

	public Music() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "music [M_ID=" + M_ID + ", T_ID=" + T_ID + ", SCENEID=" + SCENEID + ", MODEID=" + MODEID + ", GENRE_ID="
				+ GENRE_ID + ", LANGUAGID=" + LANGUAGID + ", SINGERID=" + SINGERID + ", M_NAME=" + M_NAME + ", M_URL="
				+ M_URL + ", M_COUNT=" + M_COUNT + ", M_LYRIC=" + M_LYRIC + "]";
	}

	/**
	 * �вι���
	 * 
	 * @param m_ID
	 *            ���ֱ��
	 * @param t_ID
	 *            �������ͱ��
	 * @param sCENEID
	 *            ���ֳ������
	 * @param mODEID
	 *            ���磨ƫ��ĳ�����飩���
	 * @param gENRE_ID
	 *            ���ɱ��
	 * @param lANGUAGID
	 *            �������ֱ��
	 * @param sINGERID
	 *            ���ֱ��
	 * @param m_NAME
	 *            ��������
	 * @param m_URL
	 *            ��������·��
	 * @param m_COUNT
	 *            ���ֵ������
	 * @param m_LYRIC
	 *            ���
	 */
	public Music(int m_ID, int t_ID, int sCENEID, int mODEID, int gENRE_ID, int lANGUAGID, int sINGERID, String m_NAME,
			String m_URL, int m_COUNT, String m_LYRIC) {
		super();
		M_ID = m_ID;
		T_ID = t_ID;
		SCENEID = sCENEID;
		MODEID = mODEID;
		GENRE_ID = gENRE_ID;
		LANGUAGID = lANGUAGID;
		SINGERID = sINGERID;
		M_NAME = m_NAME;
		M_URL = m_URL;
		M_COUNT = m_COUNT;
		M_LYRIC = m_LYRIC;
	}

	public int getM_ID() {
		return M_ID;
	}

	public void setM_ID(int m_ID) {
		M_ID = m_ID;
	}

	public int getT_ID() {
		return T_ID;
	}

	public void setT_ID(int t_ID) {
		T_ID = t_ID;
	}

	public int getSCENEID() {
		return SCENEID;
	}

	public void setSCENEID(int sCENEID) {
		SCENEID = sCENEID;
	}

	public int getMODEID() {
		return MODEID;
	}

	public void setMODEID(int mODEID) {
		MODEID = mODEID;
	}

	public int getGENRE_ID() {
		return GENRE_ID;
	}

	public void setGENRE_ID(int gENRE_ID) {
		GENRE_ID = gENRE_ID;
	}

	public int getLANGUAGID() {
		return LANGUAGID;
	}

	public void setLANGUAGID(int lANGUAGID) {
		LANGUAGID = lANGUAGID;
	}

	public int getSINGERID() {
		return SINGERID;
	}

	public void setSINGERID(int sINGERID) {
		SINGERID = sINGERID;
	}

	public String getM_NAME() {
		return M_NAME;
	}

	public void setM_NAME(String m_NAME) {
		M_NAME = m_NAME;
	}

	public String getM_URL() {
		return M_URL;
	}

	public void setM_URL(String m_URL) {
		M_URL = m_URL;
	}

	public int getM_COUNT() {
		return M_COUNT;
	}

	public void setM_COUNT(int m_COUNT) {
		M_COUNT = m_COUNT;
	}

	public String getM_LYRIC() {
		return M_LYRIC;
	}

	public void setM_LYRIC(String m_LYRIC) {
		M_LYRIC = m_LYRIC;
	}

}
