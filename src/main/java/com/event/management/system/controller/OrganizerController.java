package com.event.management.system.controller;


import com.event.management.system.entity.Organizer;
import com.event.management.system.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/organizers")
public class OrganizerController {

    @Autowired
    private OrganizerService organizerService;

    @PostMapping
    public Organizer createOrganizer(@RequestBody Organizer organizer) {
        return organizerService.saveOrganizer(organizer);
    }

    @GetMapping("/{id}")
    public Optional<Organizer> getOrganizerById(@PathVariable Long id) {
        return organizerService.getOrganizerById(id);
    }

    @PutMapping("/{id}")
    public Organizer updateOrganizer(@PathVariable Long id, @RequestBody Organizer organizer) {
        organizer.setId(id);
        return organizerService.updateOrganizer(organizer);
    }

    @DeleteMapping("/{id}")
    public void deleteOrganizer(@PathVariable Long id) {
        organizerService.deleteOrganizer(id);
    }
}
