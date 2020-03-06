package com.bt.video.interview.service;

import java.util.List;

import com.bt.video.interview.service.vo.GradingSheetVO;

public interface IGradingSheetService {

	/**
	 * 查詢所有評分表
	 * 
	 * @return type List<GradingSheetVO>
	 */
	public List<GradingSheetVO> queryGradingSheetList();
	
	/**
	 * 建立評分表
	 * 
	 * @param gradingSheetVO
	 */
	public void addGradingSheetMaintainSetting(GradingSheetVO gradingSheetVO);
	
	/**
	 * 編輯評分表
	 * 
	 * @param gradingSheetVO
	 */
	public void editGradingSheetMaintainSetting(GradingSheetVO gradingSheetVO);
}
