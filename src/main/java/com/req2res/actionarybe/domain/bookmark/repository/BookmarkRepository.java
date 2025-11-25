package com.req2res.actionarybe.domain.bookmark.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.req2res.actionarybe.domain.bookmark.entity.Bookmark;
import com.req2res.actionarybe.domain.user.entity.User;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

	List<Bookmark> findAllByUser(User user);

}
