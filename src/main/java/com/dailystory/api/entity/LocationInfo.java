package com.dailystory.api.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_LOCATION_INFO")
public class LocationInfo {

    /*private static final long serialVersionUID = 1L;*/
    @Id
    @Column(name = "USER_CODE")
    private String userCode;

    @OneToOne
    @JoinColumn(name = "USER_CODE")
    //@Column(nullable = false, length = 20, name = "USER_CODE")
    private UserInfo userInfo;

    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false, name = "DEVICE_TIME")
    private LocalDateTime deviceTime;

    @CreatedDate
    @Column(name = "INST_DT")
    private LocalDateTime instDt;

    /*
    public LocationInfo(String userCode, double latitude, double longitude, LocalDateTime deviceTime){
        this.userCode = userCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.deviceTime = deviceTime;
    }
    */

    /*
    public LocationInfo toEntity(){
        return LocationInfo.builder()
                .userCode(userCode)
                .latitude(latitude)
                .longitude(longitude)
                .deviceTime(deviceTime)
                .build();
    }

    @Builder
    public LocationInfo(String userCode, double lat, double lng, String deviceTime){
        this.userCode = userCode;
        this.lat = lat;
        this.lng = lng;
        this.deviceTime = deviceTime;
    }
    */
}
