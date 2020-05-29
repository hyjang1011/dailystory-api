package com.dailystory.api.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="tb_location_info")
@Getter
@Setter
@NoArgsConstructor
public class LocationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(nullable=false, length=20)
    private String userCode;

    @Column(nullable=false)
    private double lat;

    @Column(nullable=false)
    private double lng;

    @Column(nullable=false)
    private String deviceTime;

    @Builder
    public LocationInfo(String userCode, double lat, double lng, String deviceTime){
        this.userCode = userCode;
        this.lat = lat;
        this.lng = lng;
        this.deviceTime = deviceTime;
    }
}
