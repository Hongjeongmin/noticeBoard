package com.naver.notice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naver.notice.dto.User;
import com.naver.notice.service.UserService;

import io.swagger.annotations.ApiOperation;

@RequestMapping("/api/user")
@RestController
public class userController {

	@Autowired
	UserService userService;

	@ApiOperation(value = "login", notes = "성공시 200 실패시 에러")
	@PostMapping
	public ResponseEntity<String> login(User user) {

		if (userService.select(user) != null)
			return new ResponseEntity<String>("success", HttpStatus.OK);
		return new ResponseEntity<String>("fail", HttpStatus.EXPECTATION_FAILED);
	}

	@PostMapping
	public ResponseEntity<String> delete(User user) {
		
		return new ResponseEntity<String>("fail", HttpStatus.EXPECTATION_FAILED);
	}
}
