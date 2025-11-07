package com.ticketing.catalogservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "etsr_venues")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Venue {

    @Id
    @Column(name = "venue_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String city;

    private Integer capacity;
}
