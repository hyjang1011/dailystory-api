package com.dailystory.api.service;

import com.dailystory.api.entity.LocationInfo;
import com.dailystory.api.repository.LocationInfoJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class LocationInfoService {

    private final LocationInfoJpaRepo locationInfoJpaRepo;

    public LocationInfo saveLocationInfo(LocationInfo locationInfo){
        return locationInfoJpaRepo.save(locationInfo);
    }
}
