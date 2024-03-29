package org.example.headhunterapplication.dto;

import lombok.*;

import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO {

    private Integer id;
    private String name;
    private Set<PermissionDTO> permissions;

}
