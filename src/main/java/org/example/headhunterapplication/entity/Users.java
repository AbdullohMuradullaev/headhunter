package org.example.headhunterapplication.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Company> companies;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Role> roles;
    @OneToOne(cascade = CascadeType.ALL)
    private Candidate candidate;

}
