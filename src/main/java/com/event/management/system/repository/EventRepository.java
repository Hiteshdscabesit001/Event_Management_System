package com.event.management.system.repository;

import com.event.management.system.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

    List<Event> findByVenueId(Long venueId);
    List<Event> findByOrganizerId(Long organizerId);
}
