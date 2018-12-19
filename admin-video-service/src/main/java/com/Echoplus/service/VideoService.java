package com.Echoplus.service;

import com.Echoplus.pojo.Bgm;
import com.Echoplus.utils.PagedResult;

public interface VideoService {

	public void addBgm(Bgm bgm);
	
	public PagedResult queryBgmList(Integer page, Integer pageSize);
	
	public void deleteBgm(String id);
	
	public PagedResult queryReportList(Integer page, Integer pageSize);
	
	public void updateVideoStatus(String videoId, Integer status);
}
