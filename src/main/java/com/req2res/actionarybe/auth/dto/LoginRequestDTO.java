package com.req2res.actionarybe.auth.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDTO {
    @NotBlank(message = "아이디를 입력해주세요")
    private String username;
    
    @NotBlank(message = "아이디를 입력해주세요")
    private String password;
}
