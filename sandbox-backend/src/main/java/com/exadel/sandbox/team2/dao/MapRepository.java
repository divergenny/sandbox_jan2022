package com.exadel.sandbox.team2.dao;

import com.exadel.sandbox.team2.domain.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MapRepository  extends JpaRepository<Map, Long> {
    void deleteByOfficeId(Long office_id);

    Optional<Map> findByOfficeId(Long id);
}
