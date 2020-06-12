package com.dailystory.api.repository;

import com.dailystory.api.entity.LocationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationInfoJpaRepo extends JpaRepository<LocationInfo, Long> {
}
