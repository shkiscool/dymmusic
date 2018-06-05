package com.shk.entity;

/**
 * “Ù¿÷ µÃÂ¿‡
 * 
 * @author –Ï—Ô 2018/6/2 16:30
 *
 */
public class Music {

	private int M_ID; // “Ù¿÷±‡∫≈
	private int T_ID; // “Ù¿÷¿‡–Õ±‡∫≈
	private int SINGERID; // ∏Ë ÷±‡∫≈
	private String M_NAME; // “Ù¿÷√˚≥∆
	private String M_URL; // “Ù¿÷¡¥Ω”¬∑æ∂
	private int M_COUNT; // “Ù¿÷µ„ª˜¥Œ ˝
	private String M_LYRIC; // ∏Ë¥ 
	private String M_DATE; //∏Ë«˙»’∆⁄
	private String M_IMG; //∏Ë«˙Õº∆¨
	private String SINGERNAME; //∏Ë ÷√˚≥∆
	private String M_TIME; //∏Ë«˙ ±≥§
	
	
	public Music() {
		// TODO Auto-generated constructor stub
	}


	public Music(int m_ID, int t_ID, int sINGERID, String m_NAME, String m_URL, int m_COUNT, String m_LYRIC,
			String m_DATE, String m_IMG, String sINGERNAME, String m_TIME) {
		super();
		M_ID = m_ID;
		T_ID = t_ID;
		SINGERID = sINGERID;
		M_NAME = m_NAME;
		M_URL = m_URL;
		M_COUNT = m_COUNT;
		M_LYRIC = m_LYRIC;
		M_DATE = m_DATE;
		M_IMG = m_IMG;
		SINGERNAME = sINGERNAME;
		M_TIME = m_TIME;
	}


	public Music(int t_ID, int sINGERID, String m_NAME, String m_URL, int m_COUNT, String m_LYRIC, String m_DATE,
			String m_IMG, String sINGERNAME, String m_TIME) {
		super();
		T_ID = t_ID;
		SINGERID = sINGERID;
		M_NAME = m_NAME;
		M_URL = m_URL;
		M_COUNT = m_COUNT;
		M_LYRIC = m_LYRIC;
		M_DATE = m_DATE;
		M_IMG = m_IMG;
		SINGERNAME = sINGERNAME;
		M_TIME = m_TIME;
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


	public String getM_DATE() {
		return M_DATE;
	}


	public void setM_DATE(String m_DATE) {
		M_DATE = m_DATE;
	}


	public String getM_IMG() {
		return M_IMG;
	}


	public void setM_IMG(String m_IMG) {
		M_IMG = m_IMG;
	}


	public String getSINGERNAME() {
		return SINGERNAME;
	}


	public void setSINGERNAME(String sINGERNAME) {
		SINGERNAME = sINGERNAME;
	}


	public String getM_TIME() {
		return M_TIME;
	}


	public void setM_TIME(String m_TIME) {
		M_TIME = m_TIME;
	}


	@Override
	public String toString() {
		return "Music [M_ID=" + M_ID + ", T_ID=" + T_ID + ", SINGERID=" + SINGERID + ", M_NAME=" + M_NAME + ", M_URL="
				+ M_URL + ", M_COUNT=" + M_COUNT + ", M_LYRIC=" + M_LYRIC + ", M_DATE=" + M_DATE + ", M_IMG=" + M_IMG
				+ ", SINGERNAME=" + SINGERNAME + ", M_TIME=" + M_TIME + "]";
	}
	
}
