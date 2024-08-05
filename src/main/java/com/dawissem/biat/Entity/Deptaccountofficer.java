package com.dawissem.biat.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "deptaccountofficer")
public class Deptaccountofficer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    @OneToMany(mappedBy = "accountOfficer")
    private Set<Account> accounts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "agence")
    private Set<User> users = new LinkedHashSet<>();

}