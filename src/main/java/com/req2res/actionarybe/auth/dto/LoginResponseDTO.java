package com.req2res.actionarybe.auth.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDTO {
    private String userId;
    private String nickname;
    private String profileImageUrl;
    private String accessToken;
}