package com.faizal108.blogvista.category.entity;

import com.faizal108.blogvista.utils.entity.Audit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "category")
public class Category extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryID;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
