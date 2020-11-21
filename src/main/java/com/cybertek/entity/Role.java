package com.cybertek.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Role {
    private Long id;
    private String description;
}
