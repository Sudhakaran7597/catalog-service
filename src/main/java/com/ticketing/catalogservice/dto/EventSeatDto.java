package com.ticketing.catalogservice.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventSeatDto {

    private Long id;
    private Long eventId;
    private String section;
    private Integer rowNumber;
    private Integer seatNumber;
    private BigDecimal price;
}

