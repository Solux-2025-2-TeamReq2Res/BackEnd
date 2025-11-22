package com.req2res.actionarybe.domain.todo.dto;
//'투두 달성/실패 처리 API'에서 사용하는 request DTO

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TodoStatusUpdateRequestDTO {

    // "DONE" 또는 "FAILED"
    private String status;
}
