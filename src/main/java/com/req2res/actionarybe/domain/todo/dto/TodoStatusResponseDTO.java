package com.req2res.actionarybe.domain.todo.dto;
//'투두 달성/실패 처리 API'에서 사용하는 response DTO

import com.req2res.actionarybe.domain.todo.entity.Todo;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TodoStatusResponseDTO {

    private Long todoId;
    private String status;

    public static TodoStatusResponseDTO from(Todo todo) {
        return TodoStatusResponseDTO.builder()
                .todoId(todo.getId())
                .status(todo.getStatus().name())
                .build();
    }
}
