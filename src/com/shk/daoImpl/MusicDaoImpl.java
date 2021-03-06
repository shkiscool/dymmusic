package com.shk.daoImpl;

import java.util.List;

import com.shk.dao.MusicDao;
import com.shk.entity.Music;
import com.shk.util.DBUtil;

public class MusicDaoImpl implements MusicDao {

	@Override
	public boolean addMusic(Music music) {
		return false;
	}

	@Override
	public boolean delMusic(int musicId) {
		// TODO Auto-generated method stub
		return DBUtil.execute("delete from MUSIC where M_ID = ?", musicId) > 0;
	}

	@Override
	public List<Music> queryAllMusic() {
		// TODO Auto-generated method stub
		List<Music> list = (List<Music>) DBUtil.select("select MID \"mId\",TID \"tId\",SINGERID \"singerId\",MNAME \"mName\",MURL \"mUrl\",MCOUNT \"mCount\",MLYRIC \"mLyric\",MDATE \"mDate\",MIMG \"mImg\",SINGERNAME \"singerName\",MTIME \"mTime\" from MUSIC where mId = 32084464", Music.class);

		return list;
	}

	@Override
	public Music queryMusicById(int musicId) {
		// TODO Auto-generated method stub
		return (Music) DBUtil.getFirst("select * from MUSIC where M_ID = ?", musicId);
	}

	@Override
	public List<Music> queryMusicByTypeId(int typeId) {
		// TODO Auto-generated method stub
		List<Music> list = (List<Music>) DBUtil.select("select * from MUSIC where T_ID = ?", Music.class, typeId);
		return list;
	}

	@Override
	public List<Music> queryMusicBySingerId(int singerId) {
		// TODO Auto-generated method stub
		List<Music> list = (List<Music>) DBUtil.select("select * from MUSIC where SINGERID = ?", Music.class, singerId);
		return list;
	}

	@Override
	public List<Music> queryMusicBySingerName(String singerName) {
		// TODO Auto-generated method stub
		List<Music> list = (List<Music>)DBUtil.select("select * from MUSIC where SINGERNAME like ?", Music.class, singerName);
		return list;
	}

	@Override
	public List<Music> queryMusicBySongName(String songName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Music> queryMusicByAnyWord(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
