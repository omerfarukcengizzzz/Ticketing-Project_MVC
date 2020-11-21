package com.cybertek.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RoleDTO {
    private Long id;
    private String description;
}
