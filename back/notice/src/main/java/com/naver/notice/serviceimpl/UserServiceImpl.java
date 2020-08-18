package com.naver.notice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.notice.dto.User;
import com.naver.notice.repo.UserRepo;
import com.naver.notice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public User select(User user) {
		return userRepo.select(user);
	}

}
