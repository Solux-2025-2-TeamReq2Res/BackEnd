package com.req2res.actionarybe.domain.bookmark.dto;

import com.req2res.actionarybe.domain.bookmark.entity.Bookmark;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BookmarkResponseDto {
	private Long bookmarkId;
	private String bookmarkName;
	private String link;

	public static BookmarkResponseDto from(Bookmark bookmark) {
		return BookmarkResponseDto.builder()
			.bookmarkId(bookmark.getId())
			.bookmarkName(bookmark.getName())
			.link(bookmark.getLink())
			.build();
	}
}
