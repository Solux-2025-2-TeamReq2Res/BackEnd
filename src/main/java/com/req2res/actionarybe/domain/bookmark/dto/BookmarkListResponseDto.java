package com.req2res.actionarybe.domain.bookmark.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.req2res.actionarybe.domain.bookmark.entity.Bookmark;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BookmarkListResponseDto {
	List<BookmarkResponseDto> bookmarks;

	public static BookmarkListResponseDto from(List<Bookmark> bookmarks) {
		List<BookmarkResponseDto> bookmarkResponseDtos = bookmarks.stream()
			.map(BookmarkResponseDto::from)
			.collect(Collectors.toList());

		return BookmarkListResponseDto.builder()
			.bookmarks(bookmarkResponseDtos)
			.build();
	}
}
