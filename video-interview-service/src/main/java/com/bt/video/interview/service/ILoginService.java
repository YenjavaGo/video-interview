package com.bt.video.interview.service;

import com.bt.video.interview.service.vo.UserVO;

public interface ILoginService {

	/**
	 * 執行登入作業
	 * 將回傳一個不包含密碼的使用者資訊
	 * 
	 * @param userVO
	 * @return type UserVO
	 */
	public UserVO excuteLogin(UserVO userVO);
}
