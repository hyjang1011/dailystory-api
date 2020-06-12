package com.dailystory.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_LOCATION_HISTORY")
public class LocationHistory {

    /*private static final long serialVersionUID = 1L;*/
    @Id
    private long id;

    @ManyToOne
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
}
