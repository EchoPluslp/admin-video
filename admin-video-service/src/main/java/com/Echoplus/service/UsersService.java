package com.Echoplus.service;

import com.Echoplus.pojo.Users;
import com.Echoplus.utils.PagedResult;

public interface UsersService {

	public PagedResult queryUsers(Users user, Integer page, Integer pageSize);
	
}
