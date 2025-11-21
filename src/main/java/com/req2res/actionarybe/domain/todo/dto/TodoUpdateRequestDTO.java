package com.req2res.actionarybe.domain.todo.dto;
//'투두 수정 API'에서 사용하는 request DTO

import lombok.Getter;
import lombok.NoArgsConstructor;

//둘다 선택값이므로 둘다 NULL이면 수정하지 않는다.
@Getter
@NoArgsConstructor
public class TodoUpdateRequestDTO {

    private String title;     // 바꿀 제목 (선택)
    private Long categoryId;  // 바꿀 카테고리 (선택)
}