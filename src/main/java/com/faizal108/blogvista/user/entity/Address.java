package com.faizal108.blogvista.user.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {
    private String country;
    private String state;
    private String city;
}
