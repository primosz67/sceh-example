package com.example.search.job.advertisement.domain.api;

import lombok.Data;

@Data
public class CreateAdvertisementDto {

    private String title;
    private String city;
    private String description;

}
