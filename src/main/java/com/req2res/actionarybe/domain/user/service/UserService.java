package com.req2res.actionarybe.domain.user.service;

import org.springframework.stereotype.Service;

import com.req2res.actionarybe.domain.user.entity.User;
import com.req2res.actionarybe.domain.user.repository.UserRepository;
import com.req2res.actionarybe.global.exception.CustomException;
import com.req2res.actionarybe.global.exception.ErrorCode;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public User findUserByLoginId(String loginId) {
		return userRepository.findByLoginId(loginId)
			.orElseThrow(() -> new CustomException(ErrorCode.NOT_FOUND));
	}
}
