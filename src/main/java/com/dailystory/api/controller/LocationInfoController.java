package com.dailystory.api.controller;

import com.dailystory.api.entity.LocationInfo;
import com.dailystory.api.repository.LocationInfoJpaRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"1. Location"})
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/location")
public class LocationInfoController {

    @Autowired
    private final LocationInfoJpaRepo locationInfoJpaRepo;

    @ApiOperation(value = "이동거리 리스트", notes = "월별 이동거리를 리스트 형태로 조회")
    @GetMapping(value="/history/list")
    public List<LocationInfo> list(){
        return locationInfoJpaRepo.findAll();
    }

    @ApiOperation(value = "위치 저장", notes = "실시간 위치 저장")
    @PostMapping(value="/info")
    public LocationInfo save(@RequestBody LocationInfo locationInfo){
        /*
        LocationInfo locationInfo = LocationInfo.builder()
                                    .userCode("dailystory00000000")
                                    .latitude(127.101010)
                                    .longitude(37.101010)
                                    .build();
        */
        return locationInfoJpaRepo.save(locationInfo);
    }

}
