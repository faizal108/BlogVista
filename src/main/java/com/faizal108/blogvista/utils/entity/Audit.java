package com.faizal108.blogvista.utils.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class Audit implements Serializable {

    //This will auto create timestamp on new entity create
    @Column(name = "created_at")
    @CreatedDate
    private LocalDateTime createdAt;

    //This will auto update when any modification made in entity
    @Column(name = "modified_at")
    @LastModifiedDate
    private LocalDateTime modifiedAt;
}
