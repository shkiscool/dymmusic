package com.shk.dao;

import java.util.List;

import com.shk.entity.Music;

public interface MusicDao {
	public boolean addMusic(Music music);
	public boolean delMusic(int musicId);
	
	public List<Music> queryAllMusic();
	
	public Music queryMusicById(int musicId);
	public List<Music> queryMusicByTypeId(int typeId);
	public List<Music> queryMusicBySingerId(int singerId);
	public List<Music> queryMusicBySingerName(String singerName);
	public List<Music> queryMusicBySongName(String songName);
	public List<Music> queryMusicByAnyWord(String str);
	
//	public List<Music> queryFavoriteMusicByUserNameAndPwd(String userName,String userPwd);

	
}
