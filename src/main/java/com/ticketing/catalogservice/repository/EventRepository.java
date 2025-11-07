package com.ticketing.catalogservice.repository;

import com.ticketing.catalogservice.entity.Event;
import com.ticketing.catalogservice.entity.EventStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByStatus(EventStatus status);

    List<Event> findByVenue_CityAndStatus(String city, EventStatus status);

    List<Event> findByEventTypeAndStatus(String eventType, EventStatus status);

    List<Event> findByVenue_CityAndEventTypeAndStatus(String city, String eventType, EventStatus status);
}
