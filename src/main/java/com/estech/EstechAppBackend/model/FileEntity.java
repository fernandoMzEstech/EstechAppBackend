package com.estech.EstechAppBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "files")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String path;

    //  CONEXION CON CATEGORY
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    //  CONEXION CON GROUPS
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "files")
    private List<Group> groups;

}
