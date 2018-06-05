package com.shk.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;

/**
 * “Ù¿÷ µÃÂ¿‡
 * 
 * @author –Ï—Ô 2018/6/2 16:30
 *
 */
public class Music {

	private int mId;
	private int tId; // “Ù¿÷¿‡–Õ±‡∫≈
	private int sigerId; // ∏Ë ÷±‡∫≈
	private String mName; // “Ù¿÷√˚≥∆
	private String mUrl; // “Ù¿÷¡¥Ω”¬∑æ∂
	private int mCount; // “Ù¿÷µ„ª˜¥Œ ˝
	private Clob mLyric; // ∏Ë¥ 
	private String mDate; // ∏Ë«˙»’∆⁄
	private String mImg; // ∏Ë«˙Õº∆¨
	private String singerName; // ∏Ë ÷√˚≥∆
	private String mTime; // ∏Ë«˙ ±≥§

	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Music(int mId, int tId, int sigerId, String mName, String mUrl, int mCount, Clob mLyric, String mDate,
			String mImg, String singerName, String mTime) {
		super();
		this.mId = mId;
		this.tId = tId;
		this.sigerId = sigerId;
		this.mName = mName;
		this.mUrl = mUrl;
		this.mCount = mCount;
		this.mLyric = mLyric;
		this.mDate = mDate;
		this.mImg = mImg;
		this.singerName = singerName;
		this.mTime = mTime;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public int getSigerId() {
		return sigerId;
	}

	public void setSigerId(int sigerId) {
		this.sigerId = sigerId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmUrl() {
		return mUrl;
	}

	public void setmUrl(String mUrl) {
		this.mUrl = mUrl;
	}

	public int getmCount() {
		return mCount;
	}

	public void setmCount(int mCount) {
		this.mCount = mCount;
	}

	public Clob getmLyric() {
		return mLyric;
	}

	public void setmLyric(Clob mLyric) {
		this.mLyric = mLyric;
	}

	public String getmDate() {
		return mDate;
	}

	public void setmDate(String mDate) {
		this.mDate = mDate;
	}

	public String getmImg() {
		return mImg;
	}

	public void setmImg(String mImg) {
		this.mImg = mImg;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getmTime() {
		return mTime;
	}

	public void setmTime(String mTime) {
		this.mTime = mTime;
	}

	@Override
	public String toString() {
		return "Music [mId=" + mId + ", tId=" + tId + ", sigerId=" + sigerId + ", mName=" + mName + ", mUrl=" + mUrl
				+ ", mCount=" + mCount + ", mLyric=" + mLyric + ", mDate=" + mDate + ", mImg=" + mImg + ", singerName="
				+ singerName + ", mTime=" + mTime + "]";
	}
	
	

}
