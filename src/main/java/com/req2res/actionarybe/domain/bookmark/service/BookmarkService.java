package com.req2res.actionarybe.domain.bookmark.service;

import org.springframework.stereotype.Service;

import com.req2res.actionarybe.domain.bookmark.dto.BookmarkRequestDto;
import com.req2res.actionarybe.domain.bookmark.dto.BookmarkResponseDto;
import com.req2res.actionarybe.domain.bookmark.entity.Bookmark;
import com.req2res.actionarybe.domain.bookmark.repository.BookmarkRepository;
import com.req2res.actionarybe.domain.user.entity.User;
import com.req2res.actionarybe.global.exception.CustomException;
import com.req2res.actionarybe.global.exception.ErrorCode;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookmarkService {

	private final BookmarkRepository bookmarkRepository;

	public BookmarkResponseDto createBookmark(User user, @Valid BookmarkRequestDto request) {

		String bookmarkName;

		if (request.getLink().equals("")) {
			throw new CustomException(ErrorCode.BOOKMARK_LINK_NOT_FOUND);
		}
		if (request.getBookmarkName().equals("")) {
			bookmarkName = request.getLink();
		} else {
			bookmarkName = request.getBookmarkName();
		}

		Bookmark bookmark = Bookmark.builder()
			.user(user)
			.name(request.getBookmarkName())
			.link(request.getLink())
			.build();

		bookmarkRepository.save(bookmark);

		return BookmarkResponseDto.from(bookmark);
	}
}
