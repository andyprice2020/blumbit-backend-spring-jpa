package com.blumbit.web.api.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tracks", schema = "customer")
public class Track {

    @Id
    @GeneratedValue
    private Long trackId;
    private String name;
    private String composer;
    private int miliseconds;
    private int bytes;
    private float UnitPrice;
}
