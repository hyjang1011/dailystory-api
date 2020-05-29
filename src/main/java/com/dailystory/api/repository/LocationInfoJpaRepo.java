package com.dailystory.api.location.repo;

import com.dailystory.api.location.entity.LocationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationInfoJpaRepo extends JpaRepository<LocationInfo, Long> {
}
