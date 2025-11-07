package com.ticketing.catalogservice.controller;

import com.ticketing.catalogservice.dto.EventSeatDto;
import com.ticketing.catalogservice.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/events/{eventId}/seats")
@RequiredArgsConstructor
public class SeatController {

    private final CatalogService catalogService;

    @GetMapping
    public List<EventSeatDto> getSeatsForEvent(@PathVariable Long eventId) {
        return catalogService.getSeatsForEvent(eventId);
    }
}

