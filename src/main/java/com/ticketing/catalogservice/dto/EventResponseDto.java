package com.ticketing.catalogservice.dto;


import com.ticketing.catalogservice.entity.EventStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventResponseDto {

    private Long id;
    private String title;
    private String eventType;
    private EventStatus status;
    private LocalDateTime eventDate;
    private BigDecimal basePrice;
    private Long venueId;
    private String venueName;
    private String venueCity;
}
