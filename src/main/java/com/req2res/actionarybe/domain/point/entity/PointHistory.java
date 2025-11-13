package com.req2res.actionarybe.domain.point.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "point_history")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class PointHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 유저 FK
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // 적립된 포인트
    @Column(name = "earned_point", nullable = false)
    private int earnedPoint;

    // 적립 출처 ENUM
    @Enumerated(EnumType.STRING)
    @Column(name = "source", nullable = false)
    private PointSource source;

    // 적립 후 총 포인트
    @Column(name = "total_point", nullable = false)
    private int totalPoint;

    // 적립 일시
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
