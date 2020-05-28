package com.dailystory.api.location.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name="tb_location_info")
@Getter
@Setter
public class LocationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long lat;
    private Long lng;
    private String deviceTime;
}
