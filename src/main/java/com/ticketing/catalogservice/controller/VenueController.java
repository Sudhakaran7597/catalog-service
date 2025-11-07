package com.ticketing.catalogservice.controller;

import com.ticketing.catalogservice.dto.VenueDto;
import com.ticketing.catalogservice.service.CatalogService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/venues")
@RequiredArgsConstructor
public class VenueController {

    private final CatalogService catalogService;

    @GetMapping
    public List<VenueDto> getAllVenues() {
        return catalogService.getAllVenues();
    }

    @GetMapping("/{id}")
    public VenueDto getVenue(@PathVariable Long id) {
        return catalogService.getVenue(id);
    }

    @PostMapping
    public VenueDto createVenue(@RequestBody @Valid VenueDto dto) {
        return catalogService.createVenue(dto);
    }

    @PutMapping("/{id}")
    public VenueDto updateVenue(@PathVariable Long id,
                                @RequestBody @Valid VenueDto dto) {
        return catalogService.updateVenue(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteVenue(@PathVariable Long id) {
        catalogService.deleteVenue(id);
    }
}

