package com.ticketing.catalogservice.repository;

import com.ticketing.catalogservice.entity.EventSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventSeatRepository extends JpaRepository<EventSeat, Long> {

    List<EventSeat> findByEvent_Id(Long eventId);
}

