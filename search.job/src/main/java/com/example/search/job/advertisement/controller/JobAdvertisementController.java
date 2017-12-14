package com.example.search.job.advertisement.controller;

import com.example.search.job.advertisement.domain.api.CreateAdvertisementDto;
import com.example.search.job.advertisement.domain.api.JobAdvertisementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adv")
class JobAdvertisementController {

    private static final String OK = "OK";

    private final JobAdvertisementService service;

    public JobAdvertisementController(final JobAdvertisementService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody final CreateAdvertisementDto dto) {
        service.save(dto);

        return ResponseEntity.ok(OK);
    }

}
