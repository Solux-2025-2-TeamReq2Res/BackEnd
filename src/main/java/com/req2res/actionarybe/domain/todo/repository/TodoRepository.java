package com.req2res.actionarybe.domain.todo.repository;

import com.req2res.actionarybe.domain.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    // 날짜만으로 투두 조회 (카테고리 필터 없음)
    List<Todo> findAllByDate(LocalDate date);

    // 날짜 + 카테고리로 투두 조회
    List<Todo> findAllByDateAndCategoryId(LocalDate date, Long categoryId);

    //특정 유저가 어떤 날짜 범위에 가진 투두들 전체 조회
    //같은 유저 + 같은 날짜의 투두들을 조회하기 위한 메서드
    List<Todo> findAllByUserIdAndDate(Long userId,LocalDate date);

}
