package com.ticketing.catalogservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VenueDto {

    private Long id;
    private String name;
    private String city;
    private Integer capacity;
}

