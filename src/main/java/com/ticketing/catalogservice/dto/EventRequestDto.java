package com.ticketing.catalogservice.dto;

import com.ticketing.catalogservice.entity.EventStatus;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventRequestDto {

    @NotNull
    private Long venueId;

    @NotNull
    private String title;

    @NotNull
    private String eventType;      // e.g. "Concert", "Play"

    @NotNull
    private EventStatus status;    // ON_SALE, SOLD_OUT, CANCELLED, SCHEDULED

    @NotNull
    private LocalDateTime eventDate;

    private BigDecimal basePrice;
}

