package com.dailystory.api.location.controller;

import com.dailystory.api.model.LocationInfo;
import com.dailystory.api.repository.LocationInfoJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/location")
public class LocationInfoController {
    private final LocationInfoJpaRepo locationInfoJpaRepo;

    @GetMapping(value="/history/list")
    public List<LocationInfo> list(){
        return locationInfoJpaRepo.findAll();
    }

    @PostMapping(value="/info")
    public LocationInfo save(){
        LocationInfo locationInfo = LocationInfo.builder()
                                    .userCode("test")
                                    .lat(127.101010)
                                    .lng(37.101010)
                                    .deviceTime("20200528175510")
                                    .build();
        return locationInfoJpaRepo.save(locationInfo);
    }

}
