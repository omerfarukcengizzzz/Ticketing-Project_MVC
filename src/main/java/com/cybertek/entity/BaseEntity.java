package com.cybertek.entity;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BaseEntity {
    private Long id;
    private LocalDateTime insertDateTime;
    private Long insertUserId;
    private LocalDateTime lastUpdateDateTime;
    private Long lastUpdateUserId;
}
