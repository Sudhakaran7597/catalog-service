package com.ticketing.catalogservice.controller;

import com.ticketing.catalogservice.dto.EventRequestDto;
import com.ticketing.catalogservice.dto.EventResponseDto;
import com.ticketing.catalogservice.entity.EventStatus;
import com.ticketing.catalogservice.service.CatalogService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/events")
@RequiredArgsConstructor
public class EventController {

    private final CatalogService catalogService;

    /**
     * Publish event listings:
     * GET /v1/events?city=&type=&status=
     */
    @GetMapping
    public List<EventResponseDto> listEvents(
            @RequestParam(required = false) String city,
            @RequestParam(required = false, name = "type") String eventType,
            @RequestParam(required = false) EventStatus status
    ) {
        return catalogService.searchEvents(city, eventType, status);
    }

    @GetMapping("/{id}")
    public EventResponseDto getEvent(@PathVariable Long id) {
        return catalogService.getEvent(id);
    }

    @PostMapping
    public EventResponseDto createEvent(@RequestBody @Valid EventRequestDto request) {
        return catalogService.createEvent(request);
    }

    @PutMapping("/{id}")
    public EventResponseDto updateEvent(@PathVariable Long id,
                                        @RequestBody @Valid EventRequestDto request) {
        return catalogService.updateEvent(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        catalogService.deleteEvent(id);
    }
}

