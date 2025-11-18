package com.req2res.actionarybe.domain.point.entity;

import com.req2res.actionarybe.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "user_point")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class UserPoint {

    // user_id 가 PK + FK
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // 현재 총 포인트
    @Column(name = "total_point", nullable = false)
    private int totalPoint;

    // 최근 적립 일시
    @Column(name = "last_earned_at")
    private LocalDateTime lastEarnedAt;
}

